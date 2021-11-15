package com.pb.kravets.hw7;

public abstract class Clothes {
    Size size=Size.XXS;
    int stoimost;
    String color;

    public Clothes(Size size, int stoimost, String color) {
        this.size = size;
        this.stoimost = stoimost;
        this.color = color;
    }
}
