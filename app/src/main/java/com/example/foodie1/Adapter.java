package com.example.foodie1;

import android.graphics.Paint;
import android.icu.text.Transliterator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private List<Modelclass> userlist;
    Adapter(List<Modelclass> userlist)
    {
        this.userlist=userlist;
    }
    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.itemdesign,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
int foodimg1=userlist.get(position).getFoodimg();
String foodname1=userlist.get(position).getFoodname();
String countryname1=userlist.get(position).getCountryname();
String b511=userlist.get(position).getB51();

String price1=userlist.get(position).getPrice();
String minutes1=userlist.get(position).getMinutes();
int ratings1=userlist.get(position).getRatings();
String ordernow1=userlist.get(position).getOrdernow();
holder.setData(foodimg1,foodname1,countryname1,b511,price1,minutes1,ratings1,ordernow1);


            holder.b51.setPaintFlags(holder.b51.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);



    }



    @Override
    public int getItemCount() {
        return userlist.size();
    }
public class ViewHolder extends RecyclerView.ViewHolder
{

    private ImageView ratings;
    private ImageView foodimg;
    private TextView foodname;
    private TextView countryname;
    private TextView minutes;
    private TextView b51;
    private TextView price;
    private TextView ordernow;
    public ViewHolder(@NonNull View itemView) {

        super(itemView);
        ratings=itemView.findViewById(R.id.ratings);
        foodimg=itemView.findViewById(R.id.foodimg);
        foodname=itemView.findViewById(R.id.foodname);
        countryname=itemView.findViewById(R.id.countryname);
        minutes=itemView.findViewById(R.id.minutes);
        b51=itemView.findViewById(R.id.b51);
        price=itemView.findViewById(R.id.price);
        ordernow=itemView.findViewById(R.id.ordernow);
    }


    public void setData(int foodimg1,String foodname1, String countryname1, String b511, String price1, String minutes1, int ratings1, String ordernow1) {
        foodimg.setImageResource(foodimg1);
        countryname.setText(countryname1);
        minutes.setText(minutes1);
        b51.setText(b511);
       foodname.setText(foodname1);
        price.setText(price1);
        ordernow.setText(ordernow1);
        ratings.setImageResource(ratings1);
    }
}
}
