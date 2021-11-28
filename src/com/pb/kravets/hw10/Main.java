package com.pb.kravets.hw10;

public class Main {
    public static void main(String[] args) {
        NumBox<Integer> arrayInt = new NumBox<Integer>(6);
        NumBox<Float> arrayFloat = new NumBox<Float>(6);
        try {
            arrayInt.add(1);
            arrayInt.add(2);
            arrayInt.add(3);
            arrayInt.add(4);
            arrayInt.add(5);
            arrayInt.add(6);

        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Ошибка записи в массив int!!! \n"+e);
        }
        System.out.println("ВЫЧИСЛЕНИЕ НАД МАССИВОМ INT.");
        System.out.println("третий элемент массива int равен :"+arrayInt.get(2));
        System.out.println("длина массива int: " +arrayInt.length());
        System.out.println("среднее арифметическое всех элементов массива int: " +arrayInt.average());
        System.out.println("сумма всех элементов массива int: " +arrayInt.sum());
        System.out.println("максимальный элемент массива int: " +arrayInt.max()+"\n");


        try {
            arrayFloat.add(1.1f);
            arrayFloat.add(2.2f);
            arrayFloat.add(3.3f);
            arrayFloat.add(4.4f);
            arrayFloat.add(5.5f);
            arrayFloat.add(6.6f);

        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Ошибка записи в массив float!!! \n"+e);
        }
        System.out.println("\nВЫЧИСЛЕНИЕ НАД МАССИВОМ FLOAT.");
        System.out.println("третий элемент массива float равен:"+arrayFloat.get(2));
        System.out.println("длина массива float: " +arrayFloat.length());
        System.out.println("среднее арифметическое всех эементов массива float: " +arrayFloat.average());
        System.out.println("сумма всех элементов массива float: " +arrayFloat.sum());
        System.out.println("максимальный элемент массива float: " +arrayFloat.max());
    }
}
