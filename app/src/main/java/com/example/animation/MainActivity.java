package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    Button button;
    LottieAnimationView animationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //hide action bar
        getSupportActionBar().hide();

        //hide status bar
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        button = findViewById(R.id.button);
        animationView = findViewById(R.id.splash_animation);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //see the animation to full screen
                animationView.setVisibility(View.VISIBLE);

                //now hide the button
                button.setVisibility(View.GONE);

                //play the animation
                animationView.playAnimation();

                //animation for how many time (Splash)
                //Splash screen working
                Thread thread = new Thread(){

                    public void run() {
                        try {
                            sleep(4000);
                        }catch (Exception exception){
                            exception.printStackTrace();
                        }finally {
                            Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    }
                };
                thread.start();
            }
        });
    }
}