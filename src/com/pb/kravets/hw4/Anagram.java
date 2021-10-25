package com.pb.kravets.hw4;

import com.pb.kravets.hw3.Array;
import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1, str2;
        System.out.println("Программа определяет является ли одна строка анаграммой другой строки.");
        System.out.println("Введите первую строку.");
        str1 = scan.nextLine();
        System.out.println("Введите вторую строку.");
        str2 = scan.nextLine();
        //переводим обе строки в нижний регистр
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        str1 = delZnaki(str1);
        str2 = delZnaki(str2);
        str1 = sortirovkaStroki(str1);
        str2 = sortirovkaStroki(str2);
        //Сравниваем между собой две отсоритрованные строки если они одинаковые, одна строка является анаграммой другой.
        if (str1.equals(str2)){
            System.out.println("Одна строка является анаграммой другой");
        } else{
            System.out.println("Строка не является анаграммой");
        }
    }
    public static String delZnaki (String str){
        //Метод удаляет из строки знаки припинания и пробелы
        str = str.replaceAll("[^a-zA-ZА-Яа-я]","");
        return (str);
    }
    public static String sortirovkaStroki(String str){
        //этот метод сортирует строку в алфавитром порядке
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        String sorted = new String(charArray);
        return  (sorted);
    }
}
