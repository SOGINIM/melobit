package com.example.melobit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.source.DefaultMediaSourceFactory;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.melobit.R;


import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.source.DefaultMediaSourceFactory;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    public static ExoPlayer exoPlayerAudio;

    TextView newhits2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        exoPlayerAudio = new ExoPlayer.Builder(this).setMediaSourceFactory(new DefaultMediaSourceFactory(this).setLiveTargetOffsetMs(5000))
                .build(); // init AudioPlayer for all Screen
        newhits2=(TextView) findViewById(R.id.newhits2);

        newhits2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent activitylistintent = new Intent(getApplicationContext(), activitylist.class);
                startActivity(activitylistintent);

            }


        });

    }



}
