package com.example.appsale18102021;


import javax.inject.Inject;

public class Wheel {
    int quantily;
    @Inject
    public Wheel(int quantily) {
        this.quantily = quantily;
    }
}