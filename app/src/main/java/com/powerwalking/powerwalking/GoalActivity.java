package com.powerwalking.powerwalking;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class GoalActivity extends AppCompatActivity {

    RelativeLayout relativeLayout_steps, relativeLayout_minutes, relativeLayout_weight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goal);

        relativeLayout_steps = (RelativeLayout)findViewById(R.id.activity_goal_relativelayout_steps);
        relativeLayout_minutes = (RelativeLayout)findViewById(R.id.activity_goal_relativelayout_minutes);
        relativeLayout_weight = (RelativeLayout)findViewById(R.id.activity_goal_relativelayout_weight);

        relativeLayout_steps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                relativeLayout_steps.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.black));
                Intent i = new Intent(getBaseContext(), goalStepsActivity.class);
                startActivity(i);
            }
        });

        relativeLayout_minutes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                relativeLayout_minutes.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.black));
                Intent i = new Intent(getBaseContext(), goalMinutesActivity.class);
                startActivity(i);
            }
        });

        relativeLayout_weight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                relativeLayout_weight.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.black));
                Intent i = new Intent(getBaseContext(), goalWeightActivity.class);
                startActivity(i);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        relativeLayout_steps.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.colorPrimary));
        relativeLayout_minutes.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.colorPrimary));
        relativeLayout_weight.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.colorPrimary));
    }
}
