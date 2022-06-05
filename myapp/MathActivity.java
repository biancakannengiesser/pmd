package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MathActivity extends AppCompatActivity {

    EditText ten, ten2, ten3, four, eight, three;
    ImageView tenI, ten2I, ten3I, fourI, eightI, threeI;
    Button backB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);
        backButton();
    }

    public void backButton(){
        backB = findViewById(R.id.buttonback);
        backB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MathActivity.this,ThirdActivity.class));
            }
        });
    }

    public void verify(android.view.View v){
        ten =(EditText) findViewById(R.id.ten);
        ten2 =(EditText) findViewById(R.id.ten2);
        ten3 =(EditText) findViewById(R.id.ten3);
        four =(EditText) findViewById(R.id.four);
        eight =(EditText) findViewById(R.id.eight);
        three =(EditText) findViewById(R.id.three);

        if(ten.getText().toString().equals("10")){
            tenI = (ImageView) findViewById(R.id.tenI);
            tenI.setImageResource(R.drawable.green);
        }else{
            tenI = (ImageView) findViewById(R.id.tenI);
            tenI.setImageResource(R.drawable.red);
        }
        if(ten2.getText().toString().equals("10")){
            ten2I = (ImageView) findViewById(R.id.ten2I);
            ten2I.setImageResource(R.drawable.green);
        }else{
            ten2I = (ImageView) findViewById(R.id.ten2I);
            ten2I.setImageResource(R.drawable.red);
        }
        if(ten3.getText().toString().equals("10")){
            ten3I = (ImageView) findViewById(R.id.ten3I);
            ten3I.setImageResource(R.drawable.green);
        }else{
            ten3I = (ImageView) findViewById(R.id.ten3I);
            ten3I.setImageResource(R.drawable.red);
        }
        if(four.getText().toString().equals("4")){
            fourI = (ImageView) findViewById(R.id.fourI);
            fourI.setImageResource(R.drawable.green);
        }else{
            fourI = (ImageView) findViewById(R.id.fourI);
            fourI.setImageResource(R.drawable.red);
        }
        if(eight.getText().toString().equals("8")){
            eightI = (ImageView) findViewById(R.id.eightI);
            eightI.setImageResource(R.drawable.green);
        }else{
            eightI = (ImageView) findViewById(R.id.eightI);
            eightI.setImageResource(R.drawable.red);
        }
        if(three.getText().toString().equals("3")){
            threeI = (ImageView) findViewById(R.id.threeI);
            threeI.setImageResource(R.drawable.green);
        }else{
            threeI = (ImageView) findViewById(R.id.threeI);
            threeI.setImageResource(R.drawable.red);
        }

    }

}