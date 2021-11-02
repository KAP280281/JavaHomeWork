package com.pb.kravets.hw5;

public class Reader {
    private String fio;
    private int numberbilet;
    private String fakultet;
    private String dr;
    private String tel;

    String getInfoReader() {
        return "[ФИО: " + fio + " Номер билета :" + numberbilet + " Факультет:" + fakultet + " День рождения:" + dr + " Телефон:" + tel + "]";
    }
    public void setFio(String fio) {
        this.fio = fio;
    }
    public void setNumberbilet(int numberbilet) {
        this.numberbilet = numberbilet;
    }
    public void setFakultet(String fakultet) {
        this.fakultet= fakultet;
    }
    public void setDr(String dr) {
        this.dr = dr;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
    public String getFio() {
        return fio;
    }


}
