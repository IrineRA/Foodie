package com.example.foodie1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class cartview extends AppCompatActivity {
    ImageView additem,removeitem;
    int totalprice=1;
    TextView quantity;

    int totalquatity=1;
    TextView cartordernow;
    TextView price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cartview);
cartordernow=findViewById(R.id.cartordernow);
        additem=findViewById(R.id.additem);
        removeitem=findViewById(R.id.removeitem);
        quantity=findViewById(R.id.quantity);
price=findViewById(R.id.price);
cartordernow.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent i=new Intent(cartview.this,payment.class);
        startActivity(i);
    }
});
        additem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(totalquatity<10) {
                    totalquatity++;
                    quantity.setText(String.valueOf(totalquatity));
                    String valueText = price.getText().toString(); // Get the text from the 'price' TextView
                    int priceValue = Integer.parseInt(valueText);
                    String quantity1 = quantity.getText().toString();
                    int quantityValue = Integer.parseInt(quantity1);
                    totalprice = priceValue * quantityValue;
                    price.setText(String.valueOf(totalprice));
                }
            }
        });
     removeitem.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             if(totalquatity>=1)
             {
                 totalquatity--;
                 int py=150;
                 quantity.setText(String.valueOf(totalquatity));
                 String valueText = price.getText().toString(); // Get the text from the 'price' TextView
                 int priceValue = Integer.parseInt(valueText);
                 String quantity1=quantity.getText().toString();
                 int quantityValue=Integer.parseInt(quantity1);
                 totalprice=py*quantityValue;
                 price.setText(String.valueOf(totalprice));
             }

         }
     });

    }
}