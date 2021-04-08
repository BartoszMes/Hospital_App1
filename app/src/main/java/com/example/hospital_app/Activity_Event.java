package com.example.hospital_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_Event extends AppCompatActivity
{

    Button ButtonEventBack ;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__event);

        setupControls();

    }

    protected void setupControls()
    {
        ButtonEventBack = findViewById(R.id.ButtonEventBack);
        ButtonEventBack.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent =new Intent(getBaseContext(), Activity_Calendar.class);
                startActivity(intent);

                finish();
            }
        });
    }                                                                                             // protected void setupControls()


}                                                                                                 // public class Activity_Event extends AppCompatActivity