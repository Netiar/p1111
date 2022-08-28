package com.example.p1111.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;
import com.example.p1111.R;

public class IntroActivity extends AppCompatActivity  {
    boolean islottie = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        LottieAnimationView lottie = findViewById(R.id.lottie);
        lottie.setOnClickListener(v -> {

            if(islottie){
                lottie.setSpeed(-1);
                lottie.playAnimation();
                islottie = false;
            } else{
                lottie.setSpeed(1);
                lottie.playAnimation();
                islottie = true;
            }
        });


        Button button = findViewById(R.id.button);
        button.setOnClickListener(v -> startActivity(new Intent(IntroActivity.this, MainActivity.class)
        ));

        Handler handler = new Handler();
        handler.postDelayed(() -> {
            //calling main activity to load after loading screen
            startActivity(new Intent(IntroActivity.this,MainActivity.class));
            Toast.makeText(IntroActivity.this ,"Welcome", Toast.LENGTH_LONG).show();
            finish(); //finish loading screen activity
        }, 3500);
    }


}

