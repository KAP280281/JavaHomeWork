package com.pb.kravets.hw7;

public class Tie extends Clothes implements ManClothes{

    public Tie(Size size, int stoimost, String color) {
        super(size, stoimost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Галстук: размер-"+size+" Стоимость-"+stoimost+"грн Цвет- "+color);
    }
}
