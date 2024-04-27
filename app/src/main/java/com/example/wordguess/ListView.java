package com.example.wordguess;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;

public class ListView extends AppCompatActivity {
    String[] string_array;
    ArrayAdapter<String> adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        string_array = getResources().getStringArray(R.array.my_string_array);
        android.widget.ListView list = findViewById(R.id.list);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1, string_array);

        list.setAdapter(adapter);




    }
}