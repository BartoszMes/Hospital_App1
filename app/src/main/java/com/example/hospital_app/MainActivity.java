package com.example.hospital_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{


    Button buttonAccount; //Account

    Button buttonCalendar; //Calendar
    TextView theDate;

    Button buttonLocums; //Locums
    Button buttonLeave; //Leave
    Button buttonCareer; //Career
    Button buttonContacts; //Contacts
    Button buttonLinks; //Links
    Button buttonPayslips; //Payslips

    Button buttonHelp; //Help
    Button buttonAboutUS; //AboutUS

    Button buttonLogout; //Logout
    Button buttonExitApp; //ExitApp

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Calendar
        Intent incomingIntent = getIntent();
        String date = incomingIntent.getStringExtra("date");

        setupControls();
    }

    protected void setupControls()
    {
        buttonAccount = findViewById(R.id.buttonAccount);                                         // Account Class
        buttonAccount.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent =new Intent(getBaseContext(), Activity_Account.class);
                startActivity(intent);

                finish();
            }
        });

        buttonCalendar = findViewById(R.id.buttonCalendar);                                       // Calendar Class
        buttonCalendar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent =new Intent(getBaseContext(), Activity_Calendar.class);
                startActivity(intent);

                finish();
            }
        });

        buttonLocums = findViewById(R.id.buttonLocums);                                           // Locum Class
        buttonLocums.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                 Intent intent =new Intent(getBaseContext(), Activity_Locums.class);
                 startActivity(intent);

                finish();
            }
        });

        buttonLeave = findViewById(R.id.buttonLeave);                                             // Leave Class
        buttonLeave.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent =new Intent(getBaseContext(), Activity_Leave.class);
                startActivity(intent);

                finish();
            }
        });

        buttonCareer = findViewById(R.id.buttonCareer);                                           // Career Class
        buttonCareer.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent =new Intent(getBaseContext(), Activity_Career.class);
                startActivity(intent);

                finish();
            }
        });

        buttonContacts = findViewById(R.id.buttonContacts);                                       // Contacts Class
        buttonContacts.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent =new Intent(getBaseContext(), Activity_Contacts.class);
                startActivity(intent);

                finish();
            }
        });

        buttonLinks = findViewById(R.id.buttonLinks);                                             // Links Class
        buttonLinks.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent =new Intent(getBaseContext(), Activity_Links.class);
                startActivity(intent);

                finish();
            }
        });

        buttonPayslips = findViewById(R.id.buttonPayslips);                                       // Payslips Class
        buttonPayslips.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent =new Intent(getBaseContext(), Activity_Payslips.class);
                startActivity(intent);

                finish();
            }
        });

        buttonExitApp = findViewById(R.id.buttonExitApp);                                         // Exit Class
        buttonExitApp.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent =new Intent(getBaseContext(), Activity_Exit.class);
                startActivity(intent);

            }
        });

        buttonAboutUS = findViewById(R.id.buttonAboutUS);                                         // About Us Class
        buttonAboutUS.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent =new Intent(getBaseContext(), Activity_AboutUS.class);
                startActivity(intent);

                finish();
            }
        });

        buttonHelp = findViewById(R.id.buttonHelp);                                               // Help Class
        buttonHelp.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent =new Intent(getBaseContext(), Activity_Help.class);
                startActivity(intent);

                finish();
            }
        });

        buttonLogout = findViewById(R.id.buttonLogout);                                           // Logout
        buttonLogout.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent =new Intent(getBaseContext(), Activity_Login.class);
                startActivity(intent);

                finish();
            }
        });

    }                                                                                             //  protected void setupControls()

}                                                                                                 // public class MainActivity extends AppCompatActivity