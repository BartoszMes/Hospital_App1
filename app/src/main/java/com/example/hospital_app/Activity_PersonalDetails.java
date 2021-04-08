package com.example.hospital_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_PersonalDetails extends AppCompatActivity
{

    Button buttonBackAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__personal_details);




        buttonBackAccount = findViewById(R.id.buttonBackAccount);
        buttonBackAccount.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Activity_Account.class);
                startActivity(intent);

                finish();
            }
        });

    }





}