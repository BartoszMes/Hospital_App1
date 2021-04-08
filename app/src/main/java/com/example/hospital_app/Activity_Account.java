package com.example.hospital_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_Account extends AppCompatActivity
{

    Button buttonAccountBack;
    Button buttonAccountInfo;
    Button buttonPersonalDetails;
    Button buttonContracts;
    Button buttonChangeDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__account);

        setupControls();
    }                                                                                             // protected void onCreate(Bundle savedInstanceState)


    protected void setupControls() {
        buttonAccountBack = findViewById(R.id.buttonAccountBack);
        buttonAccountBack.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), MainActivity.class);
                startActivity(intent);

                finish();
            }
        });

        buttonAccountInfo = findViewById(R.id.buttonAccountInfo);
        buttonAccountInfo.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Activity_AccountInfo.class);
                startActivity(intent);

                finish();
            }
        });

        buttonPersonalDetails = findViewById(R.id.buttonPersonalDetails);
        buttonPersonalDetails.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Activity_PersonalDetails.class);
                startActivity(intent);

                finish();
            }
        });

        buttonContracts = findViewById(R.id.buttonContracts);
        buttonContracts.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Activity_Contracts.class);
                startActivity(intent);

                finish();
            }
        });

    }                                                                                             // protected void setupControls()

}                                                                                                 // protected void onCreate(Bundle savedInstanceState)