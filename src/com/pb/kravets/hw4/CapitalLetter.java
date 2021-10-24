package com.pb.kravets.hw4;

import java.util.Scanner;

public class CapitalLetter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String stroka;
        System.out.println("Программа перевода первой буквы каждого слова строки в верхний регистр.");
        System.out.println("Введите пожалуйста строку.");
        stroka = scan.nextLine();
        literUp(stroka);
    }
    public static void literUp(String stroka){
        char [] chArray = stroka.toCharArray();
        for (int i=0; i<chArray.length; i++){
            if (chArray[i]==' '){
                chArray[i+1]=Character.toUpperCase(chArray[i+1]);
            }
        }
        System.out.println(chArray);
    }
}
