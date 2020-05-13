package com.example.medical;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class enter_data extends AppCompatActivity {
    EditText name, address, phonenumber, disease, test_recommended, hospital_name;
    DatabaseReference reff;
    long maxid;
    student std;
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_data);
        std = new student();
        name = (EditText) findViewById(R.id.nm);
        address = (EditText) findViewById(R.id.adrs);
        phonenumber = (EditText) findViewById(R.id.pn);
        disease = (EditText) findViewById(R.id.disease);
        test_recommended= (EditText) findViewById(R.id.tst);
        hospital_name = (EditText) findViewById(R.id.hn);
        Toast.makeText(getApplicationContext(),"Hello",Toast.LENGTH_SHORT).show();
        reff = database.getReference();
        reff.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()){
                    maxid = (dataSnapshot.getChildrenCount());
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
    public void regi(View v){
        std.setName(name.getText().toString());
        std.setAddress(address.getText().toString());
        std.setDisease(disease.getText().toString());
        std.setHospital_name(hospital_name.getText().toString());
        std.setPhonenumber(phonenumber.getText().toString());
        std.setTests(test_recommended.getText().toString());
        reff.child(String.valueOf(maxid+1)).setValue(std);
    }

}
