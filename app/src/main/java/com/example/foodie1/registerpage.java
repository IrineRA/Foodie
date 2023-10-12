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

public class registerpage extends AppCompatActivity {
    EditText email6;
  Button login2;
    EditText password6;
    ImageView google;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registerpage);

        // Initialize your UI elements
        email6 = findViewById(R.id.email6);
      google=findViewById(R.id.google1);
      google.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent i=new Intent(registerpage.this,signin.class);
              startActivity(i);
          }
      });
        login2 = findViewById(R.id.login2);
        password6 = findViewById(R.id.password6);

        // Set a click listener for the registration button

                // Retrieve email and password when the button is clicked


                // Create a FirebaseAuth instance
                FirebaseAuth authentication = FirebaseAuth.getInstance();
      EditText password6=findViewById(R.id.password6);
      ImageView eyeicon6=findViewById(R.id.eyeicon6);
        eyeicon6.setImageResource(R.drawable.closeeye);
        eyeicon6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (password6 != null && password6.getTransformationMethod() != null && password6.getTransformationMethod().equals(HideReturnsTransformationMethod.getInstance())) {
                    password6.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    eyeicon6.setImageResource(R.drawable.closeeye);
                } else {
                    if (password6 != null && password6.getTransformationMethod() != null) {
                        password6.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                        eyeicon6.setImageResource(R.drawable.openeye);
                    }
                }
            }
        });
login2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        String email7 = email6.getText().toString();
        String password7 = password6.getText().toString();
        authentication.createUserWithEmailAndPassword(email7, password7)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Registration successful, navigate to the main activity
                            Intent i = new Intent(registerpage.this, mainactivity.class);
                            startActivity(i);
                            finish();
                        } else {
                            // Registration failed, display an error message
                            Toast.makeText(registerpage.this, "Registration failed: " , Toast.LENGTH_SHORT).show();
                        }
                    }
                });

    }
});
                // Attempt to create a new user with the provided email and password

    }
}