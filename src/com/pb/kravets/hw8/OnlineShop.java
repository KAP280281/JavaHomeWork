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
        }
        catch (WrongLoginException e){
            System.out.println("Введённый логин не соответстует требованиям");
            System.out.println("длинна должна быть от 5 до 20 символов, должен содержать только латинские буквы и цифры");
            e.printStackTrace();
        }
        catch (WrongPasswordException e){
            System.out.println("Введённый пароль не соответстует требованиям или не совпадает с проверочным.");
            System.out.println("длинна более 5, только латинские буквы и цифры и знак подчеркивания");
            e.printStackTrace();
        }


        try {
            auth.signIn(login,password);
            System.out.println("Пользователь "+auth.getLogin()+" успешно залогинился.");
        }
        catch (WrongLoginException e){
            System.out.println("Ошибка авторизации!!!");
            System.out.println("Неверно введёт логин или пароль.");
            e.printStackTrace();
        }
    }
}
