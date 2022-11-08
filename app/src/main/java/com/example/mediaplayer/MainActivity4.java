package com.example.mediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity4 extends AppCompatActivity {
     ImageView gaana;
     ImageView spotify;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        gaana = findViewById(R.id.gaana);
        spotify = findViewById(R.id.spotify);
        gaana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mains();

            }

        });
    }

    public void mains() {
        Intent intent = new Intent(this, MainActivity10.class);
        startActivity(intent);

        spotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mains1();

            }

        });
    }

    public void mains1() {
        Intent intent = new Intent(this, MainActivity11.class);
        startActivity(intent);

    }
}