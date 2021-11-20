package com.pb.kravets.hw8;

import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args){
        String login, password, confirmPassword;
        Auth auth=new Auth();
        Scanner scan = new Scanner(System.in);
        System.out.println("Пройдите пожалуйста регистрацию на сайте");
        System.out.println("Придумайте логин. (длинна должна быть от 5 до 20 символов, должен содержать только латинские буквы и цифры)");
        login = scan.nextLine();
        System.out.println("Придумайте пароль. (длинна более 5, только латинские буквы и цифры и знак подчеркивания)");
        password = scan.nextLine();
        System.out.println("Подтвердите пароль.");
        confirmPassword = scan.nextLine();
        try {
            auth.signUp(login,password,confirmPassword);
            System.out.println("Пользователь сохранён.");
            System.out.println("Войдите на сайт с помощью созданого логина и пароля.");
            System.out.println("Введите логин.");
            login = scan.nextLine();
            System.out.println("Введите пароль.");
            password = scan.nextLine();
            try {
                auth.signIn(login,password);
                System.out.println("Пользователь "+auth.getLogin()+" успешно залогинился.");
            }
            catch (WrongLoginException e3){
                System.out.println(e3.getMessage());
            }
        }
        catch (WrongLoginException e1){
            System.out.println(e1.getMessage());
        }
        catch (WrongPasswordException e2){
            System.out.println(e2.getMessage());
        }



    }
}
