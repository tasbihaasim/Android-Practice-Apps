package com.example.teacher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buttonsm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonsm = (Button) findViewById(R.id.enter_marks);
    }
    public void enter(View v){
        Intent gotoSecond = new Intent();
        gotoSecond.setClass(this, third.class);
        startActivity(gotoSecond);
    }
}
