package com.pb.kravets.hw7;

public class Tshirt extends Clothes implements ManClothes,WomenClothes{

    public Tshirt(Size size, int stoimost, String color) {
        super(size, stoimost, color);
    }


    @Override
    public void dressMan() {
        System.out.println("Футболка муржская: размер-"+size+" Стоимость-"+stoimost+"грн Цвет- "+color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Футболка женская: размер-"+size+" Стоимость-"+stoimost+"грн Цвет- "+color);
    }
}
