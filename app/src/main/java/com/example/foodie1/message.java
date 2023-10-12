package com.example.foodie1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.Manifest;
import android.content.pm.PackageManager;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class message extends AppCompatActivity {
private EditText number;
    private EditText message1;
private Button send;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        send=findViewById(R.id.send);
    send.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.M) {
                if (checkSelfPermission(Manifest.permission.SEND_SMS) == PackageManager.PERMISSION_GRANTED) {
                    sendSMS();
                } else {
                    requestPermissions(new String[]{Manifest.permission.SEND_SMS}, 1);
                }
            }
        }
    });
    }
    private void sendSMS()
    {
        String phoneNo="9344817067";
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