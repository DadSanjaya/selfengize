package com.powerwalking.powerwalking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StaticsActivity extends AppCompatActivity {

    Button button_myStatics, button_worldStatics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statics);

        button_myStatics = (Button)findViewById(R.id.activity_statics_button_my_statics);
        button_worldStatics = (Button)findViewById(R.id.activity_statics_button_world_statics);

        button_myStatics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getBaseContext(), MyStaticsActivity.class);
                startActivity(i);
            }
        });

        button_worldStatics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getBaseContext(), WorldStaticsActivity.class);
                startActivity(i);
            }
        });
    }
}
