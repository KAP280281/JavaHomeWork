package com.pb.kravets.hw7;

public class Pants extends Clothes implements ManClothes, WomenClothes{

    public Pants(Size size, int stoimost, String color) {
        super(size, stoimost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Штаны муржские: размер-"+size+" Стоимость-"+stoimost+"Цвет- "+color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Штаны женские: размер-"+size+" Стоимость-"+stoimost+"Цвет- "+color);
    }
}
