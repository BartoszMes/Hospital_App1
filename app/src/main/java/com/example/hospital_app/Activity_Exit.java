package com.example.hospital_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;

public class Activity_Exit extends AppCompatActivity
{

    Button buttonNO;
    Button buttonYES;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__exit);

        DisplayMetrics dm= new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*.8), (int)(height*.6));

        buttonNO = findViewById(R.id.buttonNO);
        buttonNO.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //  Intent intent =new Intent(getBaseContext(), MainActivity.class);
                // startActivity(intent);

                finish();
            }
        });

        buttonYES = findViewById(R.id.buttonYES);
        buttonYES.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);

                Activity_Exit.this.finish();                                                      // finish current activity "POPUP".
            }
        });



    }                                                                                             // protected void onCreate(Bundle savedInstanceState)


}                                                                                                 // public class Activity_Exit extends AppCompatActivity