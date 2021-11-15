package com.pb.kravets.hw7;

public class Skirt extends Clothes implements WomenClothes{

    public Skirt(Size size, int stoimost, String color) {
        super(size, stoimost, color);
    }


    @Override
    public void dressWomen() {
        System.out.println("Юбка: размер-"+size+" Стоимость-"+stoimost+"Цвет- "+color);
    }
}
