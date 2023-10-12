package com.example.foodie1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class Adaptercake extends FirebaseRecyclerAdapter<Modelclasscake, Adaptercake.MyViewHolder> {

    public Adaptercake(@NonNull FirebaseRecyclerOptions<Modelclasscake> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull MyViewHolder holder, int position, @NonNull Modelclasscake model) {
        holder.foodname.setText(model.getFoodname());
        holder.countryname.setText(model.getCountryname());
        holder.price.setText(model.getPrice());
        holder.b51.setText(model.getB51());
        holder.minutes.setText(model.getMinutes());
        holder.ordernow.setText(model.getOrdernow());

        Glide.with(holder.foodimg.getContext())
                .load(model.getFoodimg())
                .placeholder(com.firebase.ui.database.R.drawable.common_google_signin_btn_icon_dark)
                .error(com.firebase.ui.database.R.drawable.common_google_signin_btn_icon_dark)
                .into(holder.foodimg);

        Glide.with(holder.ratings.getContext())
                .load(model.getRatings()) // Assuming ratings is the correct field name
                .placeholder(com.google.firebase.database.ktx.R.drawable.common_google_signin_btn_icon_dark)
                .error(com.google.firebase.database.ktx.R.drawable.common_google_signin_btn_icon_dark)
                .into(holder.ratings);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemdesigncake, parent, false);
        return new MyViewHolder(view);
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView foodname, countryname, price, b51, minutes, ordernow;
        ImageView foodimg, ratings;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            foodname = (TextView) itemView.findViewById(R.id.foodname);
            countryname = (TextView) itemView.findViewById(R.id.countryname);
            price = (TextView) itemView.findViewById(R.id.price);
            b51 = (TextView) itemView.findViewById(R.id.b51);
            ordernow = (TextView) itemView.findViewById(R.id.ordernow);
            foodimg = (ImageView) itemView.findViewById(R.id.foodimg);
            minutes =(TextView) itemView.findViewById(R.id.minutes);
            price = (TextView) itemView.findViewById(R.id.price);
            ratings = (ImageView) itemView.findViewById(R.id.ratings); // Assuming you have an ImageView with the id 'ratings' in your layout
        }
    }
}
