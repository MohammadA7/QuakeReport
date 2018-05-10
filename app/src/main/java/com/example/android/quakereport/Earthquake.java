package com.example.android.quakereport;

public class Earthquake {
    String place;
    double magnitude;
    String date;

    public Earthquake(String place, double magnitude, String date) {
        this.place = place;
        this.magnitude = magnitude;
        this.date = date;
    }
}
