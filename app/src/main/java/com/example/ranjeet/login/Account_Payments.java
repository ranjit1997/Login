package com.example.ranjeet.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Account_Payments extends AppCompatActivity {
    TextView tvMyCho, tvMyPay;
    ImageView ic_magnify;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account__payments);

        tvMyCho =(TextView)findViewById(R.id.tvMyCho);
        tvMyPay =(TextView)findViewById(R.id.tvMyPay);
        ic_magnify=(ImageView) findViewById(R.id.ic_magnify);

        tvMyCho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Account_Payments.this,My_Choice.class);
                startActivity(intent);
            }
        });

        tvMyPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Account_Payments.this,My_Payments.class);
                startActivity(intent);
            }
        });

        ic_magnify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Account_Payments.this,Profile.class);
                startActivity(intent);
            }
        });
    }
}
