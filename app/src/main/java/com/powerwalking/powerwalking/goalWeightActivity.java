package com.powerwalking.powerwalking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.text.TextUtils;
import android.app.Activity;

import android.view.Menu;

public class goalWeightActivity extends AppCompatActivity {


    private EditText days;
    private EditText lossweight;
    private TextView resultView;
    private float weight = 60;
    private float height = 134;
    private String gender;
    private Integer age;
    private Double BMR;
    private Double activityLevel;
    private String male;
    private String female;
    private Integer steps = 10002;
    private double neededDays;
    private Double calorie;
    private int lb;
    private Double lose;
    private Double y;


    Button button_schedule;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goal_weight);

        lossweight = (EditText) findViewById(R.id.weight);
        resultView = (TextView) findViewById(R.id.result);


        findViewById(R.id.layout_login_button_login).setOnClickListener(new View.OnClickListener() {

            // Logic for validation, input can't be empty
            @Override
            public void onClick(View v) {


                String str2 = lossweight.getText().toString();


                if (TextUtils.isEmpty(str2)) {
                    lossweight.setError("Please enter how much you want to lose or gain using lose for (-) and gain for (+)");
                    lossweight.requestFocus();
                    return;
                }

                //       else{  Intent i = new Intent(goalWeightActivity.this, LongTermScheduleActivity.class);
                //      startActivity(i);}

//Get the user values from the widget reference

                float lossweight1 = Float.parseFloat(str2);

//Calculate BMI value
                float bmiValue = calculateBMI(weight, height);





//daily maintains

                   Double dailyMaintains=determineBMR(weight,height,age)*countSteps(steps);

//  1lb of fat is 3500 calories and loss calorie



// need to lose calorie calculate needed days

                if(1200<dailyMaintains-500) {
                    if (gender == male) {

                        neededDays = (lossweight1 * 3500 * 2.20462) % 1200;
                    } else if (gender == female) {

                        neededDays = (lossweight1 * 3500 * 2.20462) % 1200;
                    }

                }
                else{

                    //cannot archive
                }


//calculate the calories you want to lose
                //     if(dailyMaintains>saveCal)
                //  {
                //      y=dailyMaintains-saveCal;

                //  }

//Define the meaning of the bmi value
               // activityLevel = countSteps(steps);

                String bmiInterpretation = interpretBMI(bmiValue);

                resultView.setText(String.valueOf(bmiValue + "-" + bmiInterpretation ));

            }
        });

    }

    //Calculate BMI
    public float calculateBMI(float weight, float height) {
        return (float) (weight / (height * height));
    }







    //calculate BMR value
    public float determineBMR(float weight,float height,Integer age){
/*            if(gender==male)

    {

        return (float) (66 + (6.23 * weight) + (12.7 * height) - (6.8 * age));
    }
     else*/

    {
        return (float )(665 + (4.35 * weight) + (4.7 * height) - (4.7 * age));
    }

}



 public Double countSteps (float steps) {
     if (steps < 5000) {
         return 1.2;

     } else if (5000 < steps && steps <= 7499) {
         return 1.375;
     } else if (7500 <= steps && steps <= 9999) {
         return 1.55;
     } else if (10000 <= steps && steps <= 12499) {
         return 1.725;
     } else {
         return 1.9;
     }



 }

    // Interpret what BMI means
    public String interpretBMI(float bmiValue) {

        if (bmiValue < 16) {
            return "Severely underweight";
        } else if (bmiValue < 18.5) {

            return "Underweight";
        } else if (bmiValue < 25) {

            return "Normal";
        } else if (bmiValue < 30) {

            return "Overweight";
        } else {
            return "Obese";
        }



    }}
