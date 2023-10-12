package com.example.foodie1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class signin extends AppCompatActivity {
    EditText name2;
    EditText op59;
    Button login3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin);
op59=findViewById(R.id.op59);
        name2=findViewById(R.id.name1);

        FirebaseAuth authentication=FirebaseAuth.getInstance();
        EditText op59 = findViewById(R.id.op59); // Initialize op59 if you haven't already
        ImageView eyeicon = findViewById(R.id.eyeicon);
        eyeicon.setImageResource(R.drawable.closeeye);
        eyeicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (op59 != null && op59.getTransformationMethod() != null && op59.getTransformationMethod().equals(HideReturnsTransformationMethod.getInstance())) {
                    op59.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    eyeicon.setImageResource(R.drawable.closeeye);
                } else {
                    if (op59 != null && op59.getTransformationMethod() != null) {
                        op59.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                        eyeicon.setImageResource(R.drawable.openeye);
                    }
                }
            }
        });
      login3=findViewById(R.id.login3);
      login3.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              String name3=name2.getText().toString();
              String pass4=op59.getText().toString();
              authentication.signInWithEmailAndPassword(name3,pass4).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                  @Override
                  public void onComplete(@NonNull Task<AuthResult> task) {
                      if(task.isSuccessful())
                      {
                          Intent i=new Intent(signin.this, mainactivity.class);
                          startActivity(i);
                          finish();
                      }
                      else {
                          Toast.makeText(signin.this, "Invalid Password" , Toast.LENGTH_SHORT).show();
                      }
                  }
              });

          }
      });

    }
}