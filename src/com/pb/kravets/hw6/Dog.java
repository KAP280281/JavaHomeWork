package com.pb.kravets.hw6;

import java.util.Objects;

public class Dog extends Animal{
    private int volnyh;
    private String dogporoda;

    public String getDogporoda() {
        return dogporoda;
    }

    public void setDogporoda(String dogporoda) {
        this.dogporoda = dogporoda;
    }

    public int getVolnyh() {
        return volnyh;
    }

    public void setVolnyh(int volnyh) {
        this.volnyh = volnyh;
    }

    public Dog (String animal,String food, String location, int volnyh, String dogporoda){
        super(animal, food, location);
        this.volnyh=volnyh;
        this.dogporoda=dogporoda;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "volnyh=" + volnyh +
                ", dogporoda='" + dogporoda + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return volnyh == dog.volnyh && dogporoda.equals(dog.dogporoda);
    }

    @Override
    public int hashCode() {
        return Objects.hash(volnyh, dogporoda);
    }

    @Override
    public void eat() {
        System.out.println("Собака ест "+getFood());
        }

    @Override
    public void makeNoise() {
        System.out.println("Говорит ГАВ "+getAnimal());
    }

}
