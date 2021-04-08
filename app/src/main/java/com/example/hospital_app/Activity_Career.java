package com.example.hospital_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_Career extends AppCompatActivity
{

    Button buttonCareerBack;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__career);

        setupControls();
    }                                                                                             // protected void onCreate(Bundle savedInstanceState)


    protected void setupControls()
    {
        buttonCareerBack = findViewById(R.id.buttonCareerBack);
        buttonCareerBack.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent =new Intent(getBaseContext(), MainActivity.class);
                startActivity(intent);

                finish();
            }
        });
    }                                                                                             // protected void setupControls()


}                                                                                                 // public class Activity_Career extends AppCompatActivity