package com.example.ranjeet.login;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Profile extends AppCompatActivity {
//      TextView TVAccount, tvViewProfile ;
//      TextView tvFeedback;
//      ImageView IVUpdateImage;
//      RelativeLayout tvFeedbackLink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


//        TVAccount = (TextView)findViewById(R.id.TVAccount);
//        tvFeedback = (TextView)findViewById(R.id.tvFeedback);
//        tvViewProfile  = (TextView)findViewById(R.id.tvViewProfile );
//        tvFeedbackLink =(RelativeLayout)findViewById(R.id.tvFeedbackLink);
//
//        TVAccount.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent= new Intent(Profile.this,Account_Payments.class);
//                startActivity(intent);
//            }
//        });
//       tvFeedback.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent= new Intent(Profile.this,Feedback_help.class);
//                startActivity(intent);
//            }
//        });
//        tvViewProfile .setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent= new Intent(Profile.this,View_Profile.class);
//                startActivity(intent);
//            }
//        });
//
//        tvFeedbackLink.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//              goTFacebookPage("100013090008436");
//            }
//        });
//    }
//    private void goTFacebookPage(String id){
//        try {
//            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://page/" + id));
//            startActivity(intent);
//        } catch (ActivityNotFoundException e){
//            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/" + id));
//            startActivity(intent);
//        }
    }
}
