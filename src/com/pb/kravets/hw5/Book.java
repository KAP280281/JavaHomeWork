package com.pb.kravets.hw5;

public class Book {
    private String namebook;
    private String autor;
    private String year;

    String getInfoBook(){
        return "[Наименование книги: " + namebook + " Автор :" + autor + " Год издания:" + year+"]";
    }
    String getNamebook(){
        return namebook;
    }
    String getAutor(){
        return autor;
    }
    String getYear(){
        return year;
    }

    public void setNamebook(String namebook) {
        this.namebook = namebook;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public void takeBook(String namereader, int kolvo) {
        System.out.println(namereader + " взял " + kolvo + " книги");
    }
    public void takeBook(String namereader,String arraybook0, String arraybook1, String arraybook2) {
        System.out.println(namereader + " взял книги: " + arraybook0+ ", " + arraybook1+ ", "+arraybook2);
    }
    public void takeBook(String namereader,Book[] arraybook) {
        System.out.println(namereader + " взял книги: " + arraybook[0].getNamebook()+"("+arraybook[0].getAutor()+" "+arraybook[0].getYear()+"), "
                + arraybook[1].getNamebook()+"("+arraybook[1].getAutor()+" "+arraybook[1].getYear()+"), "
                + arraybook[2].getNamebook()+"("+arraybook[2].getAutor()+" "+arraybook[2].getYear()+")");
    }
    public void returnBook(String namereader, int kolvo) {
        System.out.println(namereader + " вернул " + kolvo + " книги");
    }
    public void returnBook(String namereader,String arraybook0, String arraybook1, String arraybook2) {
        System.out.println(namereader + " вернул книги: " + arraybook0+ ", " + arraybook1+ ", "+arraybook2);
    }
    public void returnBook(String namereader,Book[] arraybook) {
        System.out.println(namereader + " вернул книги: " + arraybook[0].getNamebook()+"("+arraybook[0].getAutor()+" "+arraybook[0].getYear()+"), "
                + arraybook[1].getNamebook()+"("+arraybook[1].getAutor()+" "+arraybook[1].getYear()+"), "
                + arraybook[2].getNamebook()+"("+arraybook[2].getAutor()+" "+arraybook[2].getYear()+")");
    }

}
