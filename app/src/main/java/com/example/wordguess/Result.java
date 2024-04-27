package com.example.wordguess;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    TextView result;
    Button home;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        result = findViewById(R.id.result_text);
        home = findViewById(R.id.homeButton);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Result.this, MainActivity.class);

                startActivity(intent);
            }
        });


        result.setText("Congratulations you got " + Quiz.cnt + " point out of 4");
        Quiz.cnt = 0;


    }

}