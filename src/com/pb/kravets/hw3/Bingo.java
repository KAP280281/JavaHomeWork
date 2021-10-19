package com.pb.kravets.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        int vvod, popitki=1;
        String vvodstroka = null;
        Random random = new Random();
        int x = random.nextInt(100);
        System.out.println("Попытайтесь отгадать загаданое программой число в диапазоне от 0 до 100");
        vvod = scan.nextInt();
        while (vvod!=x) {
            if (vvod<x) {
                System.out.println("Введённое Вами число меньше загадоного программой. Введите другое число.");
                System.out.println("Не хотите больше отгадывать? Тогда введите слово exit.");
            }
            if (vvod>x) {
                System.out.println("Введённое Вами число больше загадоного программой. Введите другое число.");
                System.out.println("Не хотите больше отгадывать? Тогда введите слово exit.");
            }
            vvodstroka = scan.next();
            if (vvodstroka.equals("exit")) {
                System.out.println("Выполнение программы прервано пользователем.");
                break;
            } else {
                vvod = Integer.parseInt(vvodstroka);
                popitki++;
            }
        }
      if (!(vvodstroka.equals("exit"))) {
            System.out.println("Число отгадано!!!");
            System.out.println("Колличество попыток отгадать число = " + popitki);
        }

    }
}
