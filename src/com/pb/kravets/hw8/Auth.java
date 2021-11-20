package com.pb.kravets.hw8;

public class Auth {
    String login,password;



    public String getLogin(){
        return login;
    }

    public String getPassword() {
        return password;
    }


    public void signUp(String userlogin, String userpassword, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (userlogin.length()<5||userlogin.length()>20){
            throw new WrongLoginException("Ошибка!!! Колличество символов в логине не соответсвует требованиям.");
        }
        if (!(userlogin.matches("^[a-zA-Z0-9]+$"))){
            throw new WrongLoginException("Ошибка!!! В логине присутствуют не разрешённые знаки.");
        }
        login=userlogin;
        if (userpassword.length()<5){
            throw new WrongPasswordException("Ошибка!!! Пароль должен быть больше 5 символов.");
        }
        if (!(userpassword.matches("^[a-zA-Z0-9_]+$"))){
            throw new WrongPasswordException("Ошибка!!! В пароле присутсвуют не разрешённые знаки.");
        }
        if (!(userpassword.equals(confirmPassword))){
            throw new WrongPasswordException("Ошибка!!! Не совпадет пароль с проверочным паролем.");
        }
        password=userpassword;
    }
    public void signIn(String userlogin, String userpassword) throws WrongLoginException {
        if (!((userlogin.equals(login))&&(userpassword.equals(password)))){
            throw new WrongLoginException("Ошибка авторизации!!! Логин или пароль введён не верно.");
        }
    }
}
