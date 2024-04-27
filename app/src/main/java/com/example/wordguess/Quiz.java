package com.example.wordguess;

import static android.os.StrictMode.*;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.net.URL;
import java.security.spec.ECField;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;

public class Quiz extends AppCompatActivity {

    protected final String WELCOME_TEXT = "WELCOME_TEXT";


    static int a = 0;
    static int cnt = 0;

    RadioGroup question1, question2, question3, question4;
    Button checkButton;
    TextView welcome_text;
    int[] IDs = {R.id.question1, R.id.question1_right_answer};


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        question1 = findViewById(R.id.question1);
        question2 = findViewById(R.id.question2);
        question3 = findViewById(R.id.question3);
        question4 = findViewById(R.id.question4);

        welcome_text = findViewById(R.id.Welcome_text);

        String[] stringArray = getResources().getStringArray(R.array.my_string_array);

        int lens = stringArray.length - 1;

        while(lens -- > 0){
            System.out.println(stringArray[lens]);

        }
        checkButton = findViewById(R.id.check);

        if (savedInstanceState != null) {

            welcome_text.setText("Welcome back! last time yougoState.gpoints");
            question4.check(R.id.question4_right_answer);
        }

        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                RadioButton rb = findViewById(question1.getCheckedRadioButtonId());
                if (rb.getText() == " ") {
                    cnt++;
                }
                if (question2.getCheckedRadioButtonId() == R.id.question2_right_answer) {
                    cnt++;
                }
                if (question3.getCheckedRadioButtonId() == R.id.question3_right_answer) {
                    cnt++;
                }
                if (question4.getCheckedRadioButtonId() == R.id.question4_right_answer) {
                    cnt++;
                }
                Intent intent = new Intent(Quiz.this, Result.class);

                intent.putExtra("RESULT_TEXT", cnt);

                startActivity(intent);



            }
        });




    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        // Save data to the bundle
        outState.putString("key_name", "value");
        outState.putInt("WELCOME_TEXT", cnt);
    }
}