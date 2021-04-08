package com.example.hospital_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_Contracts extends AppCompatActivity
{

    Button buttonBackContracts;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__contracts);


        setupControls();

    }                                                                                             // protected void onCreate(Bundle savedInstanceState)

    protected void setupControls()
    {
        buttonBackContracts =findViewById(R.id.buttonBackContracts);
        buttonBackContracts.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent =new Intent(getBaseContext(), Activity_Account.class);
                startActivity(intent);

                finish();
            }
        });
    }
}                                                                                                 // public class Activity_Contracts extends AppCompatActivity