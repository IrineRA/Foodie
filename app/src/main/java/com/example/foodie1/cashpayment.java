package com.example.foodie1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.Manifest;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.Manifest;
public class cashpayment extends AppCompatActivity {
   Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cashpayment);
        send=findViewById(R.id.send);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.M) {
                    if (checkSelfPermission(android.Manifest.permission.SEND_SMS) == PackageManager.PERMISSION_GRANTED) {
                        sendSMS();
                        Intent i=new Intent(cashpayment.this,successfull.class);
                        startActivity(i);
                    } else {
                        requestPermissions(new String[]{Manifest.permission.SEND_SMS}, 1);
                        Intent i=new Intent(cashpayment.this,successfull.class);
                        startActivity(i);
                    }
                }
            }
        });
    }
    private void sendSMS()
    {
        String phoneNo="9791683088";
        String SMS="Order Received Thanks for your Order";
        try {
            SmsManager smsManager=SmsManager.getDefault();
            smsManager.sendTextMessage(phoneNo,null,SMS,null,null);
            Toast.makeText(this,"Message is Send",Toast.LENGTH_SHORT).show();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Toast.makeText(this,"Failed",Toast.LENGTH_SHORT).show();
        }

    }
    }
