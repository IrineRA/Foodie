package com.example.foodie1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

public class recyclerviewcake extends AppCompatActivity {
    RecyclerView recyclerView;
    Adaptercake adaptercake;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerviewcake);

        recyclerView = (RecyclerView) findViewById(R.id.recycle2);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        FirebaseRecyclerOptions<Modelclasscake> options =
                new FirebaseRecyclerOptions.Builder<Modelclasscake>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("cakemodel"), Modelclasscake.class)
                        .build();

        adaptercake = new Adaptercake(options);
        recyclerView.setAdapter(adaptercake);
    }

    @Override
    protected void onStart() {
        super.onStart();
        adaptercake.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        adaptercake.stopListening();
    }
}
