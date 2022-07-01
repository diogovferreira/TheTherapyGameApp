package com.example.diogo.myapp;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class UserAreaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);

        final EditText etUsername = (EditText) findViewById(R.id.etUsername);
        final ImageButton etProfile = (ImageButton) findViewById(R.id.ibProfile);
        final ImageButton etMyStats = (ImageButton) findViewById(R.id.ibMyStats);
        final ImageButton etSessions = (ImageButton) findViewById(R.id.ibSessions);



        etProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent profileIntent = new Intent(UserAreaActivity.this,ProfileActivity.class);
                UserAreaActivity.this.startActivity(profileIntent);
            }
        });


        etMyStats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent mystatsIntent = new Intent(UserAreaActivity.this,MyStatsActivity.class);
                UserAreaActivity.this.startActivity(mystatsIntent);

            }
        });


        etSessions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sessionsIntent = new Intent(UserAreaActivity.this,SessionsActivity.class);
                UserAreaActivity.this.startActivity(sessionsIntent);
            }
        });
    }
}
