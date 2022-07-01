package com.example.diogo.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MyStatsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_stats);

        TextView etGames = (TextView) findViewById(R.id.tvGames);
        TextView etExercices = (TextView) findViewById(R.id.tvExercices);


        etGames.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gameStatsIntent = new Intent(MyStatsActivity.this,GameStatsActivity.class);
                MyStatsActivity.this.startActivity(gameStatsIntent);
            }
        });

        etExercices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent exercicesStatsIntent = new Intent(MyStatsActivity.this,ExercicesStatsActivity.class);
                MyStatsActivity.this.startActivity(exercicesStatsIntent);

            }
        });
    }
}
