package com.pb.kravets.hw6;

import java.util.Objects;

public class Horse extends Animal{
    private String horseporoda;
    private String horseklichka;

    //public Horse(String horseklichka, String horseporoda){
      //  this.horseklichka=horseklichka;
       // this.horseporoda=horseporoda;
    //}
    public Horse (String animal,String food, String location, String horseporoda, String horseklichka){
        super(animal, food, location);
        this.horseporoda=horseporoda;
        this.horseklichka=horseklichka;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return horseporoda.equals(horse.horseporoda) && horseklichka.equals(horse.horseklichka);
    }

    @Override
    public int hashCode() {
        return Objects.hash(horseporoda, horseklichka);
    }

    @Override
    public String toString() {
        return "Horse{" +
                "horseporoda='" + horseporoda + '\'' +
                ", horseklichka='" + horseklichka + '\'' +
                '}';
    }

    @Override
    public void eat() {
        System.out.println("Лошадь ест "+getFood());
    }

    @Override
    public void makeNoise() {
        System.out.println("Говорит И-ГО-ГО "+getAnimal());
    }
}
