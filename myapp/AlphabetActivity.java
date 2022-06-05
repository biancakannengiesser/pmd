package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class AlphabetActivity extends AppCompatActivity {

    ImageButton alphabetButton, stopButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet);
        alphabetBut();
        back();
    }

    public void alphabetBut(){
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.alphabet);
        alphabetButton = findViewById(R.id.alphabetbutton);
        alphabetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
            }
        });
        stopButton = findViewById(R.id.stopbutton);
        stopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.stop();
            }
        });
    }

    private void back(){
        Button back = findViewById(R.id.buttonback);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AlphabetActivity.this,ThirdActivity.class));
            }
        });
    }

}