package com.example.hospital_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_Links extends AppCompatActivity
{

    Button buttonLinksBack;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__links);

        setupControls();
    }                                                                                             // protected void onCreate(Bundle savedInstanceState)

    protected void setupControls()
    {
        buttonLinksBack = findViewById(R.id.buttonLinksBack);
        buttonLinksBack.setOnClickListener(new View.OnClickListener()
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

}                                                                                                 // public class Activity_Links extends AppCompatActivity
