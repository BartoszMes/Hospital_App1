package com.example.hospital_app;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;

public class Activity_Calendar extends AppCompatActivity
{
    private static final String TAG = "CalendarActivity";

    private CalendarView mCalendarView;

    Button buttonCalendarBack;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__calendar);
        mCalendarView = (CalendarView) findViewById(R.id.calendarView);

        mCalendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView calendarView, int i, int i1, int i2)
            {
                String date = (i1 + 1) + "/" + i2 + "/" + i;
                Log.d(TAG, "onSelectedDayChange: mm/dd/yyyy: " + date);

                Intent intent = new Intent(Activity_Calendar.this, Activity_Event.class);
                intent.putExtra("date", date);
                startActivity(intent);
            }
        });
        setupControls();
    }                                                                                             // protected void onCreate(Bundle savedInstanceState)

    protected void setupControls()
    {
        buttonCalendarBack = findViewById(R.id.buttonCalendarBack);
        buttonCalendarBack.setOnClickListener(new View.OnClickListener()
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


}                                                                                                 // public class Activity_Calendar extends AppCompatActivity