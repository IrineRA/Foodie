package com.example.foodie1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Paint;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class recyclerview extends AppCompatActivity {

    RecyclerView recyclerView;
    Adapter adapter;
    TextView b51;
    LinearLayoutManager layoutManager;
    List<Modelclass> userlist;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);

        initData();
        initRecyclerView();
    }

    private void initData() {
        userlist=new ArrayList<>();
        userlist.add(new Modelclass(R.drawable.c71,R.drawable.r4,"DURGA BHAVAN","South Indian","50-60 min","Rs. 150","Rs. 100","ORDER NOW"));
        userlist.add(new Modelclass(R.drawable.c72,R.drawable.rr1,"GREEN PARK RESTAURANT","Chettinad","20-25 min","Rs. 150","Rs. 100","ORDER NOW"));
        userlist.add(new Modelclass(R.drawable.c73,R.drawable.rr2,"Hotel Pallav","South Indian Chinese","30-35 min","Rs. 200","Rs. 150","ORDER NOW"));
        userlist.add(new Modelclass(R.drawable.c74,R.drawable.r4,"Spicy House","Andhra South Indian","50-60 min","Rs. 300","Rs. 200","ORDER NOW"));
        userlist.add(new Modelclass(R.drawable.c75,R.drawable.rr1,"Bharani Bhavan","South Indian Chinese","40-45 min","Rs. 200","Rs. 100","ORDER NOW"));
        userlist.add(new Modelclass(R.drawable.c76,R.drawable.rr2,"Big Bites","Andhra South Indian","20-25 min","Rs. 300","Rs. 250","ORDER NOW"));
        userlist.add(new Modelclass(R.drawable.c77,R.drawable.r4,"Bros Restaurant","Mughlai South Indian","10-15 min","Rs. 300","Rs. 200","ORDER NOW"));
        userlist.add(new Modelclass(R.drawable.c78,R.drawable.rr1,"Hotel Faasos","Chettinad Chinese","50-60 min","Rs. 200","Rs. 150","ORDER NOW"));
    }

    private void initRecyclerView() {
        recyclerView=findViewById(R.id.recycle1);
        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        adapter=new Adapter(userlist);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}