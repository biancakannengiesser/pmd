package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class FifthActivity extends AppCompatActivity {  //animals1

    Button backB, nextB;
    ImageView cat;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
        backButton();
        nextButton();
    }

    public void backButton() {
        backB = findViewById(R.id.buttonback);
        backB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FifthActivity.this, ThirdActivity.class));
            }
        });
    }

    public void nextButton() {
        nextB = findViewById(R.id.buttonnext);
        nextB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FifthActivity.this, SixthActivity.class));
            }
        });
    }
}