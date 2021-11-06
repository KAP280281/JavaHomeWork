package com.pb.kravets.hw6;

import com.pb.kravets.hw5.Reader;
import java.lang.reflect.Constructor;

public class VetClinic {
    public static void main(String[] args) throws Exception  {
        Animal animal=new Animal("Собака", "Мясо", "Коврик");
        animal.sleep();
        animal.eat();
        animal.makeNoise();

       Animal dog1 = new Dog("Лабрадор","Косточки", "Будка", 2,"Барбос");
       Animal dog2 =new Dog("Овчарка", "Собачий корм", "Вольер",5,"Рэкс");
       Animal cat1 = new Cat("Сиам", "Мыши", "Квартира",3,"Мурка");
       Animal cat2 = new Cat("Сфинкс", "Котячий корм", "Чердак",3,"Васька");
       Animal horse1 = new Horse("Аукса", "Сено", "Конюшня", "Аукса", "Камелия");
       Animal horse2 = new Horse("Кински", "Лошадинный корм", "Сарай", "Кински", "Клеопатра");

       dog1.eat();
       dog1.sleep();
       dog1.makeNoise();
       cat1.eat();
       cat1.sleep();
       cat1.makeNoise();
       horse1.eat();
       horse1.sleep();
       horse1.makeNoise();

       Animal[] arrayanimal=new Animal[]{dog1,dog2,cat1,cat2,horse1,horse2};

        Class clazz = Class.forName("com.pb.kravets.hw6.Veterinarian");
        Constructor constr = clazz.getConstructor(new Class[] {});
        Object obj = constr.newInstance();



        for (int i=0; i < 6; i++) {
            ((Veterinarian)  obj).treatAnimal(arrayanimal[i]);
        }


    }
}
