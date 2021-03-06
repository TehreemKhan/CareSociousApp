package com.app.caresociousapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;

public class SplashScreenTwo extends AppCompatActivity implements View.OnClickListener {
    private CountDownTimer timer;
    private RelativeLayout mainLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen_two);
        mainLayout = (RelativeLayout) findViewById(R.id.mainLayout);
        mainLayout.setOnClickListener(this);
        timer = new CountDownTimer(3000, 1000) {

            public void onTick(long millisUntilFinished) {
            }

            public void onFinish() {
//                startActivity(new Intent(SplashScreenTwo.this, RequestPermissionActivity.class));
                startActivity(new Intent(SplashScreenTwo.this, LoginNumberActivity.class));
                SplashScreenTwo.this.finish();

            }
        };
        timer.start();
    }


    @Override
    public void onClick(View v) {
        timer.cancel();
//        startActivity(new Intent(SplashScreenTwo.this, RequestPermissionActivity.class));
        startActivity(new Intent(SplashScreenTwo.this, LoginNumberActivity.class));
        this.finish();
    }
}
