package com.abhiprae.ichat;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Abhiprae on 10/8/2017.
 */

public class SplashActivity extends AppCompatActivity {

    SharedPreferences mypref;
    final String MYPREF = "ICHAT";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        mypref = getSharedPreferences(MYPREF,MODE_PRIVATE);
    }
}
