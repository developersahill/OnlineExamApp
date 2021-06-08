package com.example.onlineexamapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;

import com.airbnb.lottie.LottieAnimationView;

public class SplashScreen extends AppCompatActivity {

    LottieAnimationView animationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        animationView = findViewById(R.id.splashimage);



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                animationView.playAnimation();
                Intent splashintent=new Intent(SplashScreen.this,LoginActivity.class);
                startActivity(splashintent);
                finish();
            }
        },3000);

    }
}