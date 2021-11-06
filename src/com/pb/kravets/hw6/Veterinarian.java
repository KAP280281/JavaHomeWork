package com.pb.kravets.hw6;

public class Veterinarian {
    public void treatAnimal(Animal animal){
        System.out.println("На приём пришёл - "+animal.getAnimal()+ " | Питается - "+animal.getFood()+" | Проживает - "+animal.getLocation());
    }

}
