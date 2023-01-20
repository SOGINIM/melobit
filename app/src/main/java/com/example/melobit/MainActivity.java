package com.example.melobit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView newhits2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        newhits2=(TextView) findViewById(R.id.newhits2);

        newhits2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent activitylistintent = new Intent(getApplicationContext(), activitylist.class);
                startActivity(activitylistintent);

            }

        });

    }



}
