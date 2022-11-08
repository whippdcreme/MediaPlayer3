package com.example.mediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;

public class MainActivity3 extends AppCompatActivity {

    ImageView youtube;
    ImageView netflix;
    ImageView amazon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        youtube = findViewById(R.id.youtube);
        netflix = findViewById(R.id.netflix);
        amazon = findViewById(R.id.amazon);
        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mains();

            }

        });
    }

    public void mains() {
        Intent intent = new Intent(this, MainActivity7.class);
        startActivity(intent);

        netflix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mains1();

            }

        });
    }

    public void mains1() {
        Intent intent = new Intent(this, MainActivity8.class);
        startActivity(intent);


        amazon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mains2();

            }

        });
    }

    public void mains2() {
        Intent intent = new Intent(this, MainActivity9.class);
        startActivity(intent);







    }
}