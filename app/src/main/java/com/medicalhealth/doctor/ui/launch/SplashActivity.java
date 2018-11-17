package com.medicalhealth.doctor.ui.launch;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.medicalhealth.doctor.R;


public class SplashActivity extends AppCompatActivity implements View.OnClickListener{

    //:::::::::::: Constants


    //::::::::::::: Fields


    //************************************ Constructors ********************************************
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_splash);

        Button btnConnexion = findViewById(R.id.btn_login);
        btnConnexion.setOnClickListener(this);

    }


    //********************** Override Methods and Callbacks (public and Private) *******************
    @Override
    public void onClick(View v) {

        startActivity(new Intent(SplashActivity.this, SignActivity.class));
    }


    //******************************* Inner Classes or Interfaces **********************************



    //**********************************************************************************************
}
