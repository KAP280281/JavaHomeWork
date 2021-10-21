package com.pb.kravets.hw3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        final  int N = 10;
        int [] array = new int[N];
        int summa = 0, plus = 0;
        boolean flag = false;
        System.out.println("Программа работы с одномерным массивом.");
        for (int count=0; count < N; count++){
            System.out.println("Введите " + (count+1) + " элемент массива.");
            array[count] = scan.nextInt();
        }
        System.out.println("Вами введён следующий массив целых чисел.");
        for (int count=0; count < N; count++){
            System.out.println("Элемент массива " + count + " = " + array [count] );
            summa = summa + array[count];
            if (array[count]>0) {
                plus++;
            }
        }
        System.out.println("Сумма элементов введённого Вами массива = " + summa);
        System.out.println("Колличество положительных элементова массива  = " + plus);
        for (int j = 0; j != N-1; j++){
            flag = false;
            for (int i=0; i != N-1-j; i++){
                if (array[i]>array[i+1]){
                    int obmen = array[i];
                    array[i]=array[i+1];
                    array[i+1]=obmen;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
        System.out.println("Массив отсортирован методом пузырька.");
        for (int count=0; count < N; count++){
            System.out.println("Элемент массива " + count + " = " + array [count] );
            summa = summa + array[count];
            if (array[count]>0) {
                plus++;
            }
        }
    }
}

