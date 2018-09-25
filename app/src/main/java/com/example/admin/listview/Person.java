package com.example.admin.listview;

public class Person {
    private String ten;
    private int tuoi;
    private int imghinh;

    public Person(String ten, int tuoi, int imghinh) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.imghinh = imghinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getImghinh() {
        return imghinh;
    }

    public void setImghinh(int imghinh) {
        this.imghinh = imghinh;
    }
}