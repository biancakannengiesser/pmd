package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FourthActivity extends AppCompatActivity { //colors

    private Button blueB, pinkB, purpleB, orangeB, redB, greenB, yellowB, brownB;
    private Button backB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        blueButton();
        backButton();
        redButton();
        yellowButton();
        pinkButton();
        orangeButton();
        greenButton();
        purpleButton();
        brownButton();
    }

    private void blueButton(){
        blueB = findViewById(R.id.blue);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.blue);
        blueB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
            }
        });
    }

    private void redButton(){
        redB = findViewById(R.id.red);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.red);
        redB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
            }
        });
    }
    private void yellowButton(){
        yellowB = findViewById(R.id.yellow);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.yellow);
        yellowB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
            }
        });
    }
    private void greenButton(){
        greenB = findViewById(R.id.green);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.green);
        greenB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
            }
        });
    }
    private void purpleButton(){
        purpleB = findViewById(R.id.purple);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.purple);
        purpleB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
            }
        });
    }
    private void brownButton(){
        brownB = findViewById(R.id.brown);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.brown);
        brownB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
            }
        });
    }
    private void orangeButton(){
        orangeB = findViewById(R.id.orange);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.orange);
        orangeB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
            }
        });
    }
    private void pinkButton(){
        pinkB = findViewById(R.id.pink);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.pink);
        pinkB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
            }
        });
    }
    public void backButton(){
        backB = findViewById(R.id.buttonback);
        backB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FourthActivity.this,ThirdActivity.class));
            }
        });
    }
}