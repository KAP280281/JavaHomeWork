package com.pb.kravets.hw5;

public class Library {
    public static void main(String[] args){
        Book [] arraybook = new Book[3];
        Reader [] arrayreader = new Reader[3];
        for (int i=0; i < 3; i++) {
            arraybook [i] = new Book();
        }
        for (int i=0; i < 3; i++) {
            arrayreader [i] = new Reader();
        }
        arraybook [0].setNamebook("Приключения");
        arraybook [1].setNamebook("Словарь");
        arraybook [2].setNamebook("Энциклопедия");
        arraybook [0].setAutor("Иванов И.И.");
        arraybook [1].setAutor("Сидоров А.В.");
        arraybook [2].setAutor("Гусев К.В");
        arraybook [0].setYear("2000 г");
        arraybook [1].setYear("1980 г");
        arraybook [2].setYear("2010 г");
        arrayreader[0].setFio("Петров В.В.");
        arrayreader[0].setNumberbilet(1200);
        arrayreader[0].setFakultet("Информационные технологии");
        arrayreader[0].setDr("28.02.81г");
        arrayreader[0].setTel("+380979955771");
        System.out.println("Список всех книг:");
        for (int i=0; i < 3; i++) {
            System.out.println(arraybook[i].getInfoBook());
        }
        System.out.println("Список всех читателей:");
        for (int i=0; i < 3; i++) {
            System.out.println(arrayreader[i].getInfoReader());
        }
        arraybook[0].takeBook(arrayreader[0].getFio() , 3);
        arraybook[0].takeBook(arrayreader[0].getFio(),arraybook[0].getNamebook(),arraybook[1].getNamebook(),arraybook[2].getNamebook() );
        arraybook[0].takeBook(arrayreader[0].getFio(),arraybook);
        arraybook[0].returnBook(arrayreader[0].getFio() , 3);
        arraybook[0].returnBook(arrayreader[0].getFio(),arraybook[0].getNamebook(),arraybook[1].getNamebook(),arraybook[2].getNamebook() );
        arraybook[0].returnBook(arrayreader[0].getFio(),arraybook);


    }
}
