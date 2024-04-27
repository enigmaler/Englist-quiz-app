package com.example.wordguess;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button, listView, recycle;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        button = findViewById(R.id.start_button);
        listView = findViewById(R.id.list);
        recycle = findViewById(R.id.recycleView);

        recycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RecycleView.class);
                startActivity(intent);
            }
        });
        listView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListView.class);
                startActivity(intent);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Quiz.class);

                startActivity(intent);
            }
        });




    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Toast.makeText(MainActivity.this, "You are already in home page", Toast.LENGTH_SHORT).show();

    }


}