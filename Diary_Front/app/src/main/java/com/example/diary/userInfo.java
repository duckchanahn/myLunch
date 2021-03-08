package com.example.diary;

public class userInfo {

    private String id;
    private String  pw;

    public userInfo(String id) {
        this.id = id;
    }

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
