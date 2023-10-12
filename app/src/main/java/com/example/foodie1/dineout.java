package com.example.foodie1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class dineout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dineout);
        ImageSlider imageSlider=findViewById(R.id.imageslider1);
        ArrayList<SlideModel> slideModels=new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.jo1, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.jo2,ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.jo3,ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.jo4,ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.jo5,ScaleTypes.FIT));
        imageSlider.setImageList(slideModels,ScaleTypes.FIT);
    }
}