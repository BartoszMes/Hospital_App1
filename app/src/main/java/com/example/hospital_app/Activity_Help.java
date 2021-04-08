package com.example.hospital_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_Help extends AppCompatActivity
{

    Button backButtonHelp;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__help);

        setupControls();
    }                                                                                             // protected void onCreate(Bundle savedInstanceState)

    protected void setupControls()
    {

        backButtonHelp = findViewById(R.id.backButtonHelp);
        backButtonHelp.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getBaseContext(), MainActivity.class);
                startActivity(intent);

                finish();
            }

        });

    }                                                                                             // protected void setupControls()

}                                                                                                 // public class Activity_Help extends AppCompatActivity
