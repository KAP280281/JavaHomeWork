package com.pb.kravets.hw6;

import java.util.Objects;

public class Cat extends Animal{
    private int year;
    private String catklichka;

   // public Cat(int year, String catporoda){
     //   this.catklichka=catklichka;
       // this.year=year;
    //}
   public Cat (String animal,String food, String location, int year, String catklichka){
       super(animal, food, location);
       this.year=year;
       this.catklichka=catklichka;
   }

    @Override
    public String toString() {
        return "Cat{" +
                "year=" + year +
                ", catklichka='" + catklichka + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return year == cat.year && catklichka.equals(cat.catklichka);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, catklichka);
    }

    @Override
    public void eat() {
        System.out.println("Кошка ест "+getFood());
    }

    @Override
    public void makeNoise() {
        System.out.println("Говорит МЯУ "+getAnimal());
    }
}
