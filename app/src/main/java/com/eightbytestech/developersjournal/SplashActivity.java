package com.eightbytestech.developersjournal;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.BindInt;
import butterknife.ButterKnife;

public class SplashActivity extends AppCompatActivity {

    @BindInt(R.integer.splash_timeout)
    int SPLASH_TIMER;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ButterKnife.bind(this);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent splashIntent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(splashIntent);
                finish();
            }
        }, SPLASH_TIMER);
    }
}
