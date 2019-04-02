package com.example.ranjeet.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class ProfileFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_profile, container, false);

        TextView tvaccount=(TextView)v.findViewById(R.id.TVAccount);
        tvaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getActivity(),Account_Payments.class);
                startActivity(i);
            }
        });
        RelativeLayout tvfacebook=(RelativeLayout)v.findViewById(R.id.tvFeedbackLink);
        tvfacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getActivity(),Account_Payments.class);
                startActivity(i);
            }
        });
        TextView tvfeedback=(TextView)v.findViewById(R.id.tvFeedback);
        tvfeedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getActivity(),Feedback_help.class);
                startActivity(i);
            }
        });
        TextView tvprofile=(TextView)v.findViewById(R.id.tvViewProfile);
        tvprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getActivity(),View_Profile.class);
                startActivity(i);
            }
        });
        return v;
    }
}
