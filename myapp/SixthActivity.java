package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SixthActivity extends AppCompatActivity {  //animals2

    Button backB;
    ImageView wolf, lion, tiger, fox, squirrel;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);
        backButton();
    }

    public void backButton() {
        backB = findViewById(R.id.buttonback);
        backB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SixthActivity.this, FifthActivity.class));
            }
        });
    }
}