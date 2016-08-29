package io.fruitful.linhhc.dorsal.ui.activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import io.fruitful.linhhc.dorsal.R;
import io.fruitful.linhhc.dorsal.ui.fragment.LoginFragment;
import io.fruitful.linhhc.dorsal.ultils.Constant;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {

                startActivity(new Intent(SplashActivity.this, LoginActivity.class));
                finish();
            }
        }, Constant.SPLASH_DELAY_TIME);
    }
}
