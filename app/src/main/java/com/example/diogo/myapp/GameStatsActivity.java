package com.example.diogo.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class GameStatsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_stats);

        TextView tvStepHorizontal = (TextView) findViewById(R.id.tvStepH);







        tvStepHorizontal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent StepHIntent = new Intent(GameStatsActivity.this, stepHorizontal.class);
                GameStatsActivity.this.startActivity(StepHIntent);
            }
        });
    }
}
