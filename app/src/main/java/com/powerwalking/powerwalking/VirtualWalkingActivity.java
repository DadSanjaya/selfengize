package com.powerwalking.powerwalking;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VirtualWalkingActivity extends AppCompatActivity {

    Button button_play, button_statics, button_about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_virtual_walking);

        button_play = (Button)findViewById(R.id.activity_virtual_walking_button_play);
        button_statics = (Button)findViewById(R.id.activity_virtual_walking_button_statics);
        button_about = (Button)findViewById(R.id.activity_virtual_walking_button_about);
        button_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                button_play.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.colorPrimary));
                Intent i = new Intent(getBaseContext(), VitualWalkingPlayActivity.class);
                startActivity(i);
            }
        });

        button_statics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_statics.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.colorPrimary));
                Intent i = new Intent(getBaseContext(), StaticsActivity.class);
                startActivity(i);
            }
        });


        button_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_about.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.colorPrimary));
                Intent i = new Intent(getBaseContext(), VirtualWalkingAboutActivity.class);
                startActivity(i);
            }
        });

//        button_exit = (Button)findViewById(R.id.activity_virtual_walking_button_exit);
//        button_exit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                button_exit.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.black));
//                Intent i = new Intent(getBaseContext(), MainActivity.class);
//                startActivity(i);
//                finish();
//            }
//        });
    }
}
