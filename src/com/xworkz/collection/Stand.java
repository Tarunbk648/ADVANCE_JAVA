package com.xworkz.collection;

public class Stand {
    private int stand_Id;
     private String brand_name;

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public void setStand_Id(int stand_Id) {
        this.stand_Id = stand_Id;
    }

    public int getStand_Id() {
        return stand_Id;
    }

    public String getBrand_name() {
        return brand_name;
    }

    @Override
    public String toString() {
        return "Stand{" +
                "stand_Id=" + stand_Id +
                ", brand_name='" + brand_name + '\'' +
                '}';
    }
}
