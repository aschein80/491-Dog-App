package tech.fadedib.firebase;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HelpActivity extends AppCompatActivity {

    Button ExitButton;
    Button ContactButton;
    Button PrivacyButton;
    Button TOSButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        ExitButton = (Button) findViewById(R.id.exitHelpBtn);
        ExitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        //Contact Page
        ContactButton = (Button) findViewById(R.id.contactBtn);
        ContactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contactIntent = new Intent(getApplicationContext(), ContactActivity.class);
                startActivity(contactIntent);
            }
        });

        //Privacy Policy Page
        PrivacyButton = (Button) findViewById(R.id.privacyBtn);
        PrivacyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent privacyIntent = new Intent(getApplicationContext(), PrivacyActivity.class);
                startActivity(privacyIntent);
            }
        });

        //Terms Of Service Page
        TOSButton = (Button) findViewById(R.id.tosBtn);
        TOSButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tosIntent = new Intent(getApplicationContext(), TOSActivity.class);
                startActivity(tosIntent);
            }
        });
    }
}
