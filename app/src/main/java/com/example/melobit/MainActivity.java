package com.example.melobit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.melobit.R;
import com.example.melobit.MusicInfo_M;
import com.example.melobit.MusicRepository;
import com.example.melobit.HomeFragment;
import com.example.melobit.SearchFragment;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.source.DefaultMediaSourceFactory;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    public static ExoPlayer exoPlayerAudio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initBottomNavigationView();
        exoPlayerAudio = new ExoPlayer.Builder(this).setMediaSourceFactory(new DefaultMediaSourceFactory(this).setLiveTargetOffsetMs(5000))
                .build();
    }

    private void initBottomNavigationView() {
        HomeFragment firstFragment = new HomeFragment();
        SearchFragment secondFragment = new SearchFragment();
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, firstFragment).commit();
        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.home:
                    getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, firstFragment).commit();
                    return true;
                case R.id.search:
                    getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, secondFragment).commit();
                    return true;
            }
            return false;
        });
    }
}