package com.example.foodie1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class restaurant extends AppCompatActivity {
TextView b51;
TextView b52;
TextView b53;
    TextView i890;
    TextView briyaniorder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.restaurant);

     b51=findViewById(R.id.b51);
     briyaniorder=findViewById(R.id.briyaniorder);
    b51.setPaintFlags(b51.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);
        b52=findViewById(R.id.b52);
        b52.setPaintFlags(b52.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);
        b53=findViewById(R.id.b53);
        b53.setPaintFlags(b53.getPaintFlags()| Paint.STRIKE_THRU_TEXT_FLAG);
        i890=findViewById(R.id.i890);
        i890.setPaintFlags(i890.getPaintFlags()|Paint.STRIKE_THRU_TEXT_FLAG);
        briyaniorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(restaurant.this,cartview.class);
                startActivity(i);
            }
        });
    }
}