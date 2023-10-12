package com.example.foodie1;

public class Modelclass {
    private int foodimg;

    private int clock;
    private int ratings;
    private String foodname;
    private String countryname;
    private String minutes;
    private String b51;
    private String price;



    private String ordernow;

    public Modelclass(int foodimg, int ratings, String foodname, String countryname, String minutes, String b51, String price, String ordernow) {
        this.foodimg = foodimg;
        this.ratings = ratings;
        this.foodname = foodname;
        this.countryname = countryname;
        this.minutes = minutes;
        this.b51 = b51;
        this.price = price;
        this.ordernow = ordernow;
    }


    public int getFoodimg() {
        return foodimg;
    }

    public String getFoodname() {
        return foodname;
    }
    public int getRatings() {
        return ratings;
    }


    public String getCountryname() {
        return countryname;
    }

    public String getMinutes() {
        return minutes;
    }

    public String getB51() {
        return b51;
    }

    public String getPrice() {
        return price;
    }

    public String getOrdernow() {
        return ordernow;
    }
}
