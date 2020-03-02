package tech.fadedib.firebase;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class SettingsActivity extends AppCompatActivity {

    private static final String TAG = "SettingsActivity";
    Button ExitButton;
    Button UpgradeButton;
    Spinner genderSpinner;
    EditText locationEditText;
    EditText dogPreferenceEditText;
    Switch showMeSwitch;
    FirebaseAuth mAuth;
    FirebaseAuth.AuthStateListener mAuthListener;
    Button saveBtn;
    EditText distanceEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        FirebaseApp.initializeApp(this);
        //declare the database reference object. This is what we use to access the database.
        //NOTE: Unless you are signed in, this will not be useable.
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        mAuth = FirebaseAuth.getInstance();
        FirebaseUser user = mAuth.getInstance().getCurrentUser();
        final DatabaseReference myRef = database.getReference();

        mAuthListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if (user != null) {
                    // User is signed in
                    Log.d(TAG, "onAuthStateChanged:signed_in:" + user.getUid());
                } else {
                    // User is signed out
                    Log.d(TAG, "onAuthStateChanged:signed_out");
                }
                // ...
            }
        };

        // Read from the database
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                Object value = dataSnapshot.getValue();
                Log.d(TAG, "Value is: " + value);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w(TAG, "Failed to read value.", error.toException());
            }
        });


        showMeSwitch = (Switch) findViewById(R.id.showMeSwitch);
        showMeSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: Attempting to add object to database.");
                    FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
                    String userID = user.getUid();
                    if(showMeSwitch.isChecked())
                    {

                        myRef.child(userID).child("Settings").child("ShowMe").setValue(true);
                    }
                    else
                    {
                        myRef.child(userID).child("Settings").child("ShowMe").setValue(false);
                    }
                }
        });




        ExitButton = (Button) findViewById(R.id.exitBtn);
        ExitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        UpgradeButton = (Button) findViewById(R.id.upgradeBtn);
        UpgradeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(SettingsActivity.this);

                builder.setCancelable(true);
                builder.setTitle("BARKR Premium");
                builder.setMessage("You have upgraded to BARKR Premium!");

                builder.setNegativeButton("Close", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                builder.show();
                FirebaseUser user = mAuth.getInstance().getCurrentUser();
                String uid = user.getUid();
                myRef.child(uid).child("Settings").child("Premium").setValue(true);
            }
        });


        genderSpinner = (Spinner) findViewById(R.id.genderSpinner);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(SettingsActivity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.genders));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        genderSpinner.setAdapter(myAdapter);

        final String uid = user.getUid();
        //saving
        //location
        //dog breed
        dogPreferenceEditText = (EditText) findViewById(R.id.dogPreferenceEditText);
        locationEditText = (EditText) findViewById(R.id.locationDetailsEditText);
        distanceEditText = (EditText) findViewById(R.id.distanceEditText);
        saveBtn = (Button) findViewById(R.id.saveBtn);
        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myRef.child(uid).child("Settings").child("Location").setValue(locationEditText.getText().toString());
                myRef.child(uid).child("Settings").child("DogPreference").setValue(dogPreferenceEditText.getText().toString());
                myRef.child(uid).child("Settings").child("MaxDistance").setValue(distanceEditText.getText().toString());
                myRef.child(uid).child("Settings").child("Gender").setValue(genderSpinner.getSelectedItem().toString());
            }
        });

    }
}
