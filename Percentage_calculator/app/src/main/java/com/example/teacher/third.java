package com.example.teacher;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class third extends AppCompatActivity {
    EditText art, history, math, science, english;
    Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        art = (EditText) findViewById(R.id.editText8);
        history = (EditText) findViewById(R.id.editText10);
        math = (EditText) findViewById(R.id.editText11);
        science = (EditText) findViewById(R.id.editText12);
        english = (EditText) findViewById(R.id.editText13);

        next = (Button) findViewById(R.id.next);


    }
    public void avgee(View v) {
        float score = Float.valueOf(art.getText().toString());
        float sc1 = Float.valueOf(history.getText().toString());
        float sc2 = Float.valueOf(math.getText().toString());
        float sc3 = Float.valueOf(science.getText().toString());
        float sc4 = Float.valueOf(english.getText().toString());
        float avg = ((sc1 +sc2 +sc3 + sc4)/(score*4)) * 100;
        Intent gotofourth = new Intent();
        gotofourth.setClass(this, fourth.class);
        gotofourth.putExtra("res", avg);
        startActivity(gotofourth);


    }
    }



