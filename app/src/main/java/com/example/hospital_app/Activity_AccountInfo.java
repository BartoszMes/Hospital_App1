package com.example.hospital_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_AccountInfo extends AppCompatActivity
{

   Button buttonBackAccountInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__account_info);

        buttonBackAccountInfo = findViewById(R.id.buttonBackAccountInfo);
        buttonBackAccountInfo.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Activity_Account.class);
                startActivity(intent);

                finish();
            }
        });


    }                                                                                             // protected void onCreate(Bundle savedInstanceState)

}                                                                                                 // public class Activity_AccountInfo extends AppCompatActivity