package tech.fadedib.firebase;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    Button exitButton;
    Button usernameButton;
    Button passwordButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


        exitButton = (Button) findViewById(R.id.exitBtn);
        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        usernameButton = (Button) findViewById((R.id.usernameBtn));
        usernameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent changeUsernameIntent = new Intent(getApplicationContext(), ChangeUsernameActivity.class);
                startActivity(changeUsernameIntent);
            }
        });
        passwordButton = (Button) findViewById(R.id.passwordBtn);
        passwordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent changePasswordIntent = new Intent(getApplicationContext(), ChangePasswordActivity.class);
                startActivity(changePasswordIntent);
            }
        });


    }
}
