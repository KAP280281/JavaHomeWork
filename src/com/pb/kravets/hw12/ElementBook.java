package com.pb.kravets.hw12;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class ElementBook {
    private String fullName;
    private transient LocalDate dateOfDirth;
    ArrayList<String> pfone = new ArrayList<>();
    private String adress;
    private transient LocalDateTime dateOfModife;

    public ElementBook() {
    }

    public ElementBook(String fullName, LocalDate dateOfDirth, ArrayList<String> telList, String adress) {
        this.fullName = fullName;
        this.dateOfDirth = dateOfDirth;
        this.pfone = telList;
        this.adress = adress;
        this.dateOfModife = LocalDateTime.now();
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getDateOfDirth() {
        return dateOfDirth;
    }

    public void setDateOfDirth(LocalDate dateOfDirth) {
        this.dateOfDirth = dateOfDirth;
    }

    public ArrayList<String> getPfone() {
        return pfone;
    }

    public void setPfone(ArrayList<String> pfone) {
        this.pfone = pfone;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public LocalDateTime getDateOfModife() {
        return dateOfModife;
    }

    public void setDateOfModife(LocalDateTime dateOfModife) {
        this.dateOfModife = dateOfModife;
    }


    @Override
    public String toString() {
        return  "ElementBook{" +
                "ФИО='" + fullName + '\'' +
                ", День рождения=" + dateOfDirth +
                ", номер телефона='" + pfone + '\'' +
                ", адресс='" + adress + '\'' +
                ", дата/время редактирования=" + dateOfModife +
                '}'+'\n';
    }
}
