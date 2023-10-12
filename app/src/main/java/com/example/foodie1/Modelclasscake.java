package com.example.foodie1;

public class Modelclasscake {
    private String foodimg;


    private String ratings;
    private String foodname;
    private String countryname;
    private String minutes;
    private String b51;
    private String price;

    public void setFoodimg(String foodimg) {
        this.foodimg = foodimg;
    }

    public void setRatings(String ratings) {
        this.ratings = ratings;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    public void setMinutes(String minutes) {
        this.minutes = minutes;
    }

    public void setB51(String b51) {
        this.b51 = b51;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setOrdernow(String ordernow) {
        this.ordernow = ordernow;
    }

    private String ordernow;
Modelclasscake()
{

}
    public Modelclasscake(String foodimg,String ratings, String foodname, String countryname, String minutes, String b51, String price, String ordernow) {
        this.foodimg = foodimg;
        this.ratings = ratings;
        this.foodname = foodname;
        this.countryname = countryname;
        this.minutes = minutes;
        this.b51 = b51;
        this.price = price;
        this.ordernow = ordernow;
    }


    public String getFoodimg() {
        return foodimg;
    }

    public String getFoodname() {
        return foodname;
    }
    public String getRatings() {
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
