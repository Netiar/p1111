package com.example.p1111.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

import com.airbnb.lottie.LottieAnimationView;
import com.example.p1111.R;

public class IntroActivity extends AppCompatActivity  {
    boolean islottie = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        LottieAnimationView lottie = findViewById(R.id.lottie);
        lottie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(islottie){
                    lottie.setSpeed(-1);
                    lottie.playAnimation();
                    islottie = false;
                } else{
                    lottie.setSpeed(1);
                    lottie.playAnimation();
                    islottie = true;
                }
            }
        });


        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IntroActivity.this, MainActivity.class));
            }
        });

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //calling main activity to load after loading screen
                startActivity(new Intent(IntroActivity.this,MainActivity.class));
                finish(); //finish loading screen activity
            }
        }, 3500);
    }


}