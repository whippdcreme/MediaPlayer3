package com.example.mediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;


public class MainActivity2 extends AppCompatActivity {
    ImageView VIDEO;
    ImageView AUDIO;
    ImageView STUDIES;
    ImageView SOCIALAPPS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        VIDEO = findViewById(R.id.VIDEO);
        AUDIO = findViewById(R.id.AUDIO);
        STUDIES = findViewById(R.id.STUDIES);
        SOCIALAPPS = findViewById(R.id.SOCIALAPPS);
        VIDEO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mains();

            }

        });
    }

    public void mains() {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);

        AUDIO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mains1();

            }

        });
    }

    public void mains1() {
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);


        STUDIES.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mains2();

            }

        });
    }

    public void mains2() {
        Intent intent = new Intent(this, MainActivity5.class);
        startActivity(intent);


        SOCIALAPPS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mains3();

            }

        });
    }

    public void mains3() {
        Intent intent = new Intent(this, MainActivity6.class);
        startActivity(intent);

    }
}