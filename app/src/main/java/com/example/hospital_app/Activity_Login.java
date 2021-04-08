package com.example.hospital_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_Login extends AppCompatActivity
{
    private EditText Name;
    private EditText Password;
    private TextView Info;
    private Button Login;
    private int counter = 5;                                                                      // Int

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__login);

        Name = (EditText) findViewById(R.id.editTextTextName);
        Password = (EditText) findViewById(R.id.editTextTextPassword);
        Info = (TextView) findViewById(R.id.textViewInfo);
        Login = (Button) findViewById(R.id.buttonLogin);

        Info.setText ("No of attempts remaining : 5");

        Login.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
               validate (Name.getText().toString(), Password.getText().toString());
            }
        });
    }                                                                                               // protected void onCreate(Bundle savedInstanceState)

    private void validate(String userName, String userPassword)
    {
        if ((userName.equals( "Admin")) && (userPassword.equals ("1234")))
        {
            Intent intent = new Intent (Activity_Login.this, MainActivity.class);
            startActivity(intent);

            finish();
        }
            else
            {
                counter --;

                Info.setText ("No of attempts reaming:" + String.valueOf(counter));

                if(counter == 0)
                {
                    Login.setEnabled(false);                                                       // Button disable after 5 attempts

                    Toast.makeText(this, " Your device is locked ", Toast.LENGTH_LONG).show();
                }

            }

    }                                                                                               // private void validate(String userName, String userPassword)

}                                                                                                   // public class Activity_Login extends AppCompatActivity
