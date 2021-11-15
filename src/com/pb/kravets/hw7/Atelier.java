package com.pb.kravets.hw7;

public class Atelier {
    public static void main(String[] args) {
        Clothes tshirt = new Tshirt(Size.XXS,250,"Красный");
        Clothes pants = new Pants(Size.XS,20,"Синий");
        Clothes skirt = new Skirt(Size.S,120,"Чёрный");
        Clothes tie = new Tie(Size.L,5,"Зелёный");

        Clothes[] clothes = new Clothes[]{tshirt,pants,skirt,tie};



        dressMan(clothes);
        dressWomen(clothes);


    }
    static void dressMan (Clothes[] clothes){
        System.out.println("Муржская одержда:");
        for (Clothes clothe: clothes){
            if (clothe instanceof ManClothes){
                ((ManClothes) clothe).dressMan();
            }
        }
    }

    static void dressWomen (Clothes[] clothes){
        System.out.println("Женская одержда:");
        for (Clothes clothe: clothes){
            if (clothe instanceof WomenClothes){
                ((WomenClothes) clothe).dressWomen();
            }
        }
    }
}
