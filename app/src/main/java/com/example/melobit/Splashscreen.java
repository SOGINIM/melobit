package com.example.melobit;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;




@SuppressLint("CustomSplashScreen")
public class Splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);


        new Handler().postDelayed(() -> {
            startActivity(new Intent(this, MainActivity.class));

            finish();
        }, 4000);
    }
}