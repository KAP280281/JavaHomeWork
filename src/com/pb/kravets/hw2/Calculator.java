package com.pb.kravets.hw2;

import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.util.Scanner;

public class Calculator {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand1, operand2;
        String Sign;

        System.out.println("Введите значение первого операнда");
        operand1 = scan.nextInt();
        System.out.println("Введите значение второго операнда");
        operand2 = scan.nextInt();
        System.out.println("Введите один из следующих арифметических знаков - + * /");
        Sign = scan.next();

        switch (Sign) {
            case "-":
                System.out.println(operand1+Sign+operand2+'='+(operand1-operand2) );
                break;
            case "+":
                System.out.println(operand1+Sign+operand2+'='+(operand1+operand2) );
                break;
            case "*":
                System.out.println(operand1+Sign+operand2+'='+(operand1*operand2) );
                break;
            case "/": {
                if (operand2 !=0) {
                    System.out.println(operand1+Sign+operand2+'='+(operand1/operand2) );
                } else {
                    System.out.println("ОШИБКА!!! НА НОЛЬ ДЕЛИТЬ НЕЛЬЗЯ");
                }
                break;
            }
        }

    }
}
