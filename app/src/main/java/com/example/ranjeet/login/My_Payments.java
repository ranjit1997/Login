package com.example.ranjeet.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class My_Payments extends AppCompatActivity {
       ImageView ic_magnify;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my__payments);

        ic_magnify =(ImageView)findViewById(R.id.ic_magnify);


        ic_magnify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(My_Payments.this,Account_Payments.class);
                startActivity(intent);
            }
        });

    }
}
