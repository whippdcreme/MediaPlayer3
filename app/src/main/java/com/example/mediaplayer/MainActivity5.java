package com.example.mediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity5 extends AppCompatActivity {
    ImageView javatpoint;
    ImageView stackoverflow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        javatpoint = findViewById(R.id.javatpoint);
        stackoverflow = findViewById(R.id.stackoverflow);
        javatpoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mains();

            }

        });
    }

    public void mains() {
        Intent intent = new Intent(this, MainActivity12.class);
        startActivity(intent);

        stackoverflow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mains1();

            }

        });
    }

    public void mains1() {
        Intent intent = new Intent(this, MainActivity13.class);
        startActivity(intent);
    }
}