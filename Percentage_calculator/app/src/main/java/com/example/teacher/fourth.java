package com.example.teacher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.text.DecimalFormat;

public class fourth extends AppCompatActivity {
    EditText result;
    float y;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        result = (EditText) findViewById(R.id.editText);
        Intent sth = getIntent();
        y= sth.getFloatExtra("res", 0);
        String s = Float.toString(y);
        DecimalFormat formatVal = new DecimalFormat("##.##");
        result.setText(s);

    }
    public void message(View v){
        Intent gotofifth = new Intent();
        gotofifth.setClass(this, fifth.class);
        startActivity(gotofifth);
    }
}
