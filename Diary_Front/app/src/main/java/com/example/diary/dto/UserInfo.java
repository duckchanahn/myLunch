package com.example.diary.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserInfo {

//    @SerializedName("id")
//    @Expose private String id;
//    @SerializedName("pw")
//    @Expose private String  pw;

    private String id;
    private String pw;

    public String getId() {return id;}
    public void setId(String id) {this.id = id;}

    public String getPw() {return pw;}
    public void setPw(String name) {pw = name;}


    @Override
    public String toString() {
        return "userInfo{" +
                "id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                '}';
    }

}
