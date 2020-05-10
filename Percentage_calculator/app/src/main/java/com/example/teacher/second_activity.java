package com.example.teacher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class second_activity extends AppCompatActivity {
    EditText sn, id;
    Button nxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activity);
        nxt = (Button) findViewById(R.id.next);
        sn = (EditText) findViewById(R.id.editText3);
        id = (EditText) findViewById(R.id.editText4);
    }
    public void newacc(View v){
        String nm = sn.toString();
        String ids= id.toString();
        Intent gotoThird = new Intent();
        gotoThird.setClass(this, third.class);
        gotoThird.putExtra("name", nm);
        gotoThird.putExtra("id", ids);
        startActivity(gotoThird);
    };

}
