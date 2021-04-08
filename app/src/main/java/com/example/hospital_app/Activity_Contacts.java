package com.example.hospital_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_Contacts extends AppCompatActivity
{

    Button buttonContactsBack;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__contacts);

        setupControls();
    }                                                                                             // protected void onCreate(Bundle savedInstanceState)

    protected void setupControls()
    {
        buttonContactsBack = findViewById(R.id.buttonContactsBack);
        buttonContactsBack.setOnClickListener(new View.OnClickListener()
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


}                                                                                                 // public class Activity_Contacts extends AppCompatActivity