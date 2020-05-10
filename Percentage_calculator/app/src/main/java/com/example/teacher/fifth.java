package com.example.teacher;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class fifth extends AppCompatActivity {
    EditText numb;
    Button sndd;
    final int SEND_SMS_PERMISSION_REQUEST_CODE = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
        numb = (EditText) findViewById(R.id.editText2);
        sndd = (Button) findViewById(R.id.snd);
        sndd.setEnabled(false);
        if (checkPermission(Manifest.permission.SEND_SMS)){
            sndd.setEnabled(true);
        }
        else{
            ActivityCompat.requestPermissions(this,
                    new String[] {Manifest.permission.SEND_SMS},  SEND_SMS_PERMISSION_REQUEST_CODE);
        }
    }
    public void sendd(View v){
        String num = numb.getText().toString();
        Intent Caller = getIntent();
        int y= Caller.getIntExtra("result", 0);
        String reslt = String.valueOf(y);
        if (checkPermission(Manifest.permission.SEND_SMS)){
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(num, null, "Your child's percentage for this year is: " + reslt, null, null);
            Toast.makeText(this, "Message Sent!!", Toast.LENGTH_SHORT).show();
        }
    }
    public boolean checkPermission(String permission){
        int check = ContextCompat.checkSelfPermission(this, permission);
        return (check == PackageManager.PERMISSION_GRANTED);
    }
}
