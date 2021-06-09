package com.example.onlineexamapp;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    TextView login_btn , signup_btn;

    TextView login_txt , signup_txt;

    EditText username_login , email_login , number_login , password_login;

    EditText email_signup , password_signup;

    LinearLayout login_layout , signup_layout;

    ImageView background;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login_btn = findViewById(R.id.login_btn);
        signup_btn = findViewById(R.id.signup_btn);

        login_txt = findViewById(R.id.login);
        signup_txt = findViewById(R.id.signup);

        username_login = findViewById(R.id.username_edittext);
        email_login = findViewById(R.id.email_edittext);
        number_login = findViewById(R.id.mobileno_edittext);
        password_login = findViewById(R.id.password_edittext);

        email_signup = findViewById(R.id.email_signup);
        password_signup = findViewById(R.id.password_signup);

        login_layout = findViewById(R.id.login_layout);
        signup_layout = findViewById(R.id.signup_layout);

        signup_txt.setTextColor(Color.GRAY);

        background = findViewById(R.id.bg);



        signup_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                background.setImageResource(R.drawable.signup_bg);
                login_txt.setTextColor(Color.GRAY);
                signup_txt.setTextColor(Color.BLACK);
                login_layout.setVisibility(View.GONE);
                signup_layout.setVisibility(View.VISIBLE);

                login_btn.setVisibility(View.GONE);

                signup_btn.setVisibility(View.VISIBLE);

            }
        });

        login_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                background.setImageResource(R.drawable.login_bg);
                signup_txt.setTextColor(Color.GRAY);
                login_txt.setTextColor(Color.BLACK);
                login_layout.setVisibility(View.VISIBLE);
                signup_layout.setVisibility(View.GONE);

                signup_btn.setVisibility(View.GONE);

                login_btn.setVisibility(View.VISIBLE);

            }
        });

    }
}