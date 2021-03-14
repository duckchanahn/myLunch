package com.example.diary.dto;

public class Location {

    private String district;
    private String haengjeong;
    private String address;

    public String getDistrict() {return district;}
    public void setDistrict(String district) {this.district = district;}

    public String getHaengjeong() {return haengjeong;}
    public void setHaengjeong(String haengjeong) {this.haengjeong = haengjeong;}

    public String getAddress() {return address;}
    public void setAddress(String address) {this.address = address;}

    @Override
    public String toString() {
        return "restaurant{" +
                "district='" + district + '\'' +
                "haengjeong='" + haengjeong + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
