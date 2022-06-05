package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class ThirdActivity extends AppCompatActivity {  //main page

    Button logoutB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        colorsButton();
        animalsButton();
        mathsButton();
        alphabetButton();
        fruitsButton();
        vegetablesButton();
    }

    private void colorsButton(){
        Button colorsB = findViewById(R.id.colors);
        colorsB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ThirdActivity.this,FourthActivity.class));
            }
        });
    }

    private void fruitsButton(){
        Button fruitsB = findViewById(R.id.fruits);
        fruitsB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ThirdActivity.this,FruitActivity.class));
            }
        });
    }

    private void mathsButton(){
        Button colorsB = findViewById(R.id.maths);
        colorsB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ThirdActivity.this,MathActivity.class));
            }
        });
    }

    private void alphabetButton(){
        Button colorsB = findViewById(R.id.alphabet);
        colorsB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ThirdActivity.this,AlphabetActivity.class));
            }
        });
    }

    private void animalsButton(){
        Button animalsB = findViewById(R.id.animals);
        animalsB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ThirdActivity.this,FifthActivity.class));
            }
        });
    }
    private void vegetablesButton(){
        Button vegetablesB = findViewById(R.id.vegetables);
        vegetablesB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ThirdActivity.this,VegetablesActivity.class));
            }
        });
    }

    public void logout(View view){
        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(ThirdActivity.this,MainActivity.class));
        finish();
    }
}