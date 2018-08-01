package com.powerwalking.powerwalking;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class LoginActivity extends Activity {

    private EditText editText_name;
    private EditText editText_age;
    private EditText editText_height;
    private Spinner spinner_gender;
    private Button button_login;
    public static Integer age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editText_name = (EditText)findViewById(R.id.layout_login_edittext_name);
        editText_age = (EditText)findViewById(R.id.layout_login_edittext_age);
        editText_height = (EditText)findViewById(R.id.layout_login_edittext_height);
        spinner_gender = (Spinner)findViewById(R.id.layout_login_spinner_gender);
        button_login = (Button)findViewById(R.id.layout_login_button_login);

        button_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hideSoftKeyboard(LoginActivity.this, button_login);
                if(validateData()){
                    Intent i = new Intent(getBaseContext(), MainActivity.class);
                    startActivity(i);
                }
            }
        });


    }

    private boolean validateData(){
        String name = editText_name.getText().toString();
        String ageTemp = editText_age.getText().toString();

        String height = editText_height.getText().toString();
        int genderId = spinner_gender.getSelectedItemPosition();
        if(name == null || name.isEmpty() || name.trim().isEmpty()){
            showSnackbar("Please enter a valid name");
            return false;
        }

        if(ageTemp == null || ageTemp.isEmpty() || ageTemp.trim().isEmpty()){
            showSnackbar("Please enter a valid age");
            return false;
        }

        age = Integer.valueOf(ageTemp);

        if(height == null || height.isEmpty() || height.trim().isEmpty()){
            showSnackbar("Please enter a valid height");
            return false;
        }


        if(genderId == 0){
            showSnackbar("Please select your gender");
            return false;
        }

        return true;
    }

    private void showSnackbar(String message){
        Snackbar snackbar = Snackbar.make(findViewById(android.R.id.content), message, Snackbar.LENGTH_LONG);
        snackbar.show();
    }

    private void hideSoftKeyboard (Activity activity, View view)
    {
        InputMethodManager imm = (InputMethodManager)activity.getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(view.getApplicationWindowToken(), 0);
    }
}
