package com.example.foodie1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class mainactivity extends AppCompatActivity {
TextView kfc;
TextView kfc2;
    TextView cake;
    ImageView frontpagecart1;
    TextView frontpagecart;
    TextView mutton;
    ImageView dineout4;
    ImageView briyanifront1;
    TextView icecream;
    TextView bri;
    TextView mutton1;
    TextView cakeordernow;
ImageView dineout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainactivity);
        ImageSlider imageSlider=findViewById(R.id.imageslider);
        ArrayList<SlideModel> slideModels=new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.do1, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.do2,ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.do3,ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.do4,ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.do5,ScaleTypes.FIT));
        imageSlider.setImageList(slideModels,ScaleTypes.FIT);
kfc=findViewById(R.id.kfc);
        cakeordernow=findViewById(R.id.cakeordernow);
        cakeordernow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(mainactivity.this,recyclerviewcake.class);
                startActivity(i);
            }
        });
frontpagecart=findViewById(R.id.frontpagecart);
frontpagecart.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent i=new Intent(mainactivity.this,cartview.class);
        startActivity(i);
    }
});
        frontpagecart1=findViewById(R.id.frontpagecart1);
        frontpagecart1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(mainactivity.this,cartview.class);
                startActivity(i);
            }
        });
kfc.setPaintFlags(kfc.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);
        kfc2=findViewById(R.id.kfc2);
        kfc2.setPaintFlags(kfc2.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);
       cake=findViewById(R.id.cake);
        cake.setPaintFlags(cake.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);
        cake=findViewById(R.id.cake);
        cake.setPaintFlags(cake.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);
        cake=findViewById(R.id.cake);
        cake.setPaintFlags(cake.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);
        icecream=findViewById(R.id.icecream);
        icecream.setPaintFlags(icecream.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);
        mutton=findViewById(R.id.mutton);
        mutton.setPaintFlags(mutton.getPaintFlags()|Paint.STRIKE_THRU_TEXT_FLAG);
        bri=findViewById(R.id.bri);
        bri.setPaintFlags(bri.getPaintFlags()|Paint.STRIKE_THRU_TEXT_FLAG);
   dineout=findViewById(R.id.dineout);
       dineout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(mainactivity.this,dineout.class);
                startActivity(i);
            }
        });
        dineout4=findViewById(R.id.dineout4);
        dineout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(mainactivity.this,cart.class);
                startActivity(i);
            }
        });
        briyanifront1=findViewById(R.id.briyanifront1);
        briyanifront1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(mainactivity.this,restaurant.class);
                startActivity(i);
            }
        });
    }
}