package com.example.medical;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {
    Button enter_data;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enter_data = (Button) findViewById(R.id.button2);

    }
    public void next(View v){
        if (v.equals(enter_data)){
            Intent gotoSecond = new Intent();
            gotoSecond.setClass(this, enter_data.class);
            startActivity(gotoSecond);
        }

    }



        //public void onClick(View v) {

            //reff.child(String.valueOf(maxid+1)).setValue(std);




    }

