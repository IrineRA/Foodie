package com.example.foodie1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class front extends AppCompatActivity {

    TextView i4;
    TextView i5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.front);
        i4=findViewById(R.id.i4);
        i5=findViewById(R.id.i5);
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(front.this,signin.class);
                startActivity(i);
            }
        });
        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(front.this,registerpage.class);
                startActivity(i);
            }
        });

    }
}