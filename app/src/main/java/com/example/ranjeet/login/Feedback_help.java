package com.example.ranjeet.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Feedback_help extends AppCompatActivity {
      TextView tvShare, rateapp;
      ImageView ic_magnify;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback_help);

        ic_magnify =(ImageView)findViewById(R.id.ic_magnify);
        rateapp =findViewById(R.id.rateapp);
        // This code is Share button
        tvShare =(TextView)findViewById(R.id.tvShare);
        tvShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Intent.ACTION_SEND);
                myIntent.setType("Text/Plain");
                String shareBody = "Your Body Here";
                String shareSub = "Your Subject Here";
                myIntent.putExtra(Intent.EXTRA_TEXT,shareBody);
                myIntent.putExtra(Intent.EXTRA_SUBJECT,shareSub);
                startActivity(Intent.createChooser(myIntent,"Share Using"));
            }
        });
        // This code is back button
        ic_magnify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Feedback_help.this,Profile.class);
                startActivity(intent);
            }
        });

        rateapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Feedback_help.this,Rateing.class);
                startActivity(intent);
            }
        });
    }
}
