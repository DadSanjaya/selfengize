package com.powerwalking.powerwalking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class LongTermScheduleActivity extends AppCompatActivity {
    TextView a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_long_term_schedule);

         a=(TextView) findViewById(R.id.lol);

        Toast.makeText(getApplicationContext(), "Loss Weight is : " + String.valueOf(goalWeightActivity.weightLoss), Toast.LENGTH_SHORT).show();

    }


}
