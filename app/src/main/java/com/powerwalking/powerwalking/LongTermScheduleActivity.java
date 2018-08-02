package com.powerwalking.powerwalking;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

public class LongTermScheduleActivity extends AppCompatActivity {
    TextView a;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_long_term_schedule);

         a=(TextView) findViewById(R.id.lol);

        Toast.makeText(getApplicationContext(), "Loss Weight is : " + String.valueOf(goalWeightActivity.weightLoss), Toast.LENGTH_SHORT).show();

        String url = "https://jsonplaceholder.typicode.com/todos/1";

        RequestQueue requestQueue = Volley.newRequestQueue(this);

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(
                Request.Method.GET,
                url,
                null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        Log.i("test", "response : " + response.toString());
                        Toast.makeText(getApplicationContext(), "response : " + response.toString(), Toast.LENGTH_SHORT).show();
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.i("test", "error : " + error.toString());
                        Toast.makeText(getApplicationContext(), "error : " + error.toString(), Toast.LENGTH_SHORT).show();
                    }
                }
        );

        requestQueue.add(jsonObjectRequest);




    }


}
