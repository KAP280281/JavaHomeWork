package com.pb.kravets.hw2;

import java.util.Scanner;

public class Interval {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        int vvod;

        System.out.println("Введите пожалуйста целое число");
        vvod = scan.nextInt();
        if (0>=vvod || vvod<=14) {
            System.out.println("Введённое число попадает в промежуток [0-14]");
        } else if (15>=vvod || vvod<=35) {
            System.out.println("Введённое число попадает в промежуток [15-35]");
        } else if (36>=vvod || vvod<=50) {
            System.out.println("Введённое число попадает в промежуток [36-50]");
        } else if (51>=vvod || vvod<=100) {
                        System.out.println("Введённое число попадает в промежуток [51-100]");
                    } else System.out.println("Введённое число не попадает не в один из заданых промежутков!!!");






    }
}
