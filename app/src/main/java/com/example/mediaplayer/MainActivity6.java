package com.example.mediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity6 extends AppCompatActivity {
     ImageView facebook;
     ImageView twitter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        facebook = findViewById(R.id.twitter);
        twitter = findViewById(R.id.twitter);
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mains();

            }

        });
    }

    public void mains() {
        Intent intent = new Intent(this, MainActivity14.class);
        startActivity(intent);

        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mains1();

            }

        });
    }

    public void mains1() {
        Intent intent = new Intent(this, MainActivity15.class);
        startActivity(intent);
    }
}