package com.example.ranjeet.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CreateAccount extends AppCompatActivity {
    Button btnRegister;
    TextView tvSignin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
        btnRegister  = (Button)findViewById(R.id.btnRegister);
        tvSignin = (TextView)findViewById(R.id.tvSignin);


        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(CreateAccount.this,MainActivity.class);
                startActivity(intent);
            }
        });

        tvSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(CreateAccount.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
