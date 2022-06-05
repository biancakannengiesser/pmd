package com.example.myapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SecondActivity extends AppCompatActivity {     //sign up

    Button buttonCreateAccount, goBackButton;
    FirebaseAuth fAuth;
    EditText name, username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        fAuth = FirebaseAuth.getInstance();
        name = findViewById(R.id.NameAccount);
        username = findViewById(R.id.UsernameAccount);
        password = findViewById(R.id.passwordAccount);
        buttonCreateAccount = (Button) findViewById(R.id.buttonCreateAccount);

        if (fAuth.getCurrentUser() != null){
            startActivity(new Intent(SecondActivity.this,MainActivity.class));
            finish();
        }

        buttonCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameAccount = name.getText().toString().trim();
                String passwordAccount = password.getText().toString().trim();
                String usernameAccount = username.getText().toString().trim();

                if(TextUtils.isEmpty(usernameAccount)){
                    username.setError("Email is required.");
                    return;
                }
                if(TextUtils.isEmpty(passwordAccount)){
                    password.setError("Password is required.");
                    return;
                }
                if(TextUtils.isEmpty(nameAccount)){
                    name.setError("Name is required.");
                    return;
                }
                if(passwordAccount.length() < 6){
                    password.setError("Password length must be >= 6 characters.");
                    return;
                }

                fAuth.createUserWithEmailAndPassword(usernameAccount, passwordAccount).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(SecondActivity.this, "User Created.", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(SecondActivity.this,ThirdActivity.class));
                        }else{
                            Toast.makeText(SecondActivity.this, "Error!" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });

        goBackButton();
    }

    private void goBackButton(){
        goBackButton = (Button) findViewById(R.id.goBackButton);
        goBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}