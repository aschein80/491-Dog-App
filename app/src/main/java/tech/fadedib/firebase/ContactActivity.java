package tech.fadedib.firebase;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ContactActivity extends AppCompatActivity {

    Button ExitButton;
    TextView contactDetailsTextView;
    TextView supportTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        ExitButton = (Button) findViewById(R.id.exitBtn);
        ExitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        contactDetailsTextView = (TextView) findViewById(R.id.contactDetailsTextView);
        contactDetailsTextView.setText("Have any problems you need help with? Contact us or email us and we will get back to you as soon as possible.");

        supportTextView = (TextView) findViewById(R.id.supportTextView);
        supportTextView.setText("Contact Us at BarkrSupportDesk@gmail.com");
    }
}
