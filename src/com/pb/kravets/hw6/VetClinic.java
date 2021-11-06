package com.pb.kravets.hw6;

import com.pb.kravets.hw5.Reader;

public class VetClinic {
    public static void main(String[] args) {


       Animal dog1 = new Dog("Лабрадор","Косточки", "Будка", 2,"Барбос");
       Animal dog2 =new Dog("Овчарка", "Собачий корм", "Вольер",5,"Рэкс");
       Animal cat1 = new Cat("Сиам", "Мыши", "Квартира",3,"Мурка");
       Animal cat2 = new Cat("Сфинкс", "Котячий корм", "Чердак",3,"Васька");
       Animal horse1 = new Horse("Аукса", "Сено", "Конюшня", "Аукса", "Камелия");
       Animal horse2 = new Horse("Кински", "Лошадинный корм", "Сарай", "Кински", "Клеопатра");

       Animal[] arrayanimal=new Animal[]{dog1,dog2,cat1,cat2,horse1,horse2};

        Class clazz = Class.forName("hw6.Veterinarian");
        Constructor constr = clazz.getConstructor(new Class[] {String.class});
       //Veterinarian veterinarian=new Veterinarian();
        for (int i=0; i < 6; i++) {
            veterinarian.treatAnimal(arrayanimal[i]);
        }


    }
}
