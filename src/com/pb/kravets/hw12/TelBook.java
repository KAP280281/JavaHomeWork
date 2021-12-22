package com.pb.kravets.hw12;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class TelBook {
    static Scanner scan = new Scanner(System.in);



    public static ElementBook SozdanieElementa () {
        System.out.println("Введите ФИО\n");
        String name = scan.next();
        System.out.println("Введите год рождения\n");
        int yea = scan.nextInt();
        System.out.println("Введите месяц рождения\n");
        int month = scan.nextInt();
        System.out.println("Введите число рождения\n");
        int day = scan.nextInt();
        ArrayList<String> telList = new ArrayList<>();
        String vibor;
        do {
            System.out.println("Введите телефон\n");
            String tel = scan.next();
            telList.add(tel);
            System.out.println("Хотите ввести ещё номер телефона? Y/N\n");
            vibor = scan.next();
        } while ((vibor.equals( "Y"))||vibor.equals( "y"));
        System.out.println("Введите адресс\n");
        String adress = scan.next();
        ElementBook elementBook = new ElementBook(name, LocalDate.of(yea, month, day), telList, adress);
        return elementBook;
    }

    public static void main(String[] args) throws Exception {
        String meny;
        boolean zapusk=true;
        ArrayList<ElementBook> person = new ArrayList<>();
        String fileName = "c:\\Users\\Александр\\IdeaProjects\\JavaHomeWork\\files\\TelBookLamda.json";
        Path fileTelBook= Paths.get(fileName);

        ObjectMapper mapper = new ObjectMapper();
        // pretty printing (json с отступами)
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        // для работы с полями типа LocalDate и LocalDateTime
        SimpleModule module = new SimpleModule();
        module.addSerializer(LocalDate.class, new LocalDateSerializer());
        module.addSerializer(LocalDateTime.class, new LocalDateTimeSerializer());
        module.addDeserializer(LocalDate.class, new LocalDateDeserializer());
        module.addDeserializer(LocalDateTime.class, new LocalDateTimeDeserializer());
        mapper.registerModule(module);

        while (zapusk){
            System.out.println("Телефонная книга МЕНЮ:\n" +
                    "1 Добавление элемента\n" +
                    "2 Удаление элемента\n" +
                    "3 Поиск элементов\n" +
                    "4 Вывод всех записей с сортировкой\n" +
                    "5 Редактирование элемента\n" +
                    "6 Запись в файл всех данных\n" +
                    "7 Загрузка из файла всех данных\n" +
                    "0 Выход из программы\n");
            meny = scan.next();
            switch (meny) {
                case "1": {
                    System.out.println("1 Добавление элемента\n");
                    ElementBook elementBook = SozdanieElementa();
                    person.add(elementBook);
                    System.out.println(person);
                    break;
                }
                case "2": {
                    System.out.println("2 Удаление элемента\n");
                    System.out.println("Введите ФИО абонента для удаления\n");
                    String delElement = scan.next();
                    for (int i=0; i<person.size(); i++){
                        if (delElement.equals(person.get(i).getFullName())) {
                            person.remove(i);
                        }
                    }
                    System.out.println(person);
                    break;
                }
                case "3": {
                    System.out.println("3 Поиск элементов\n");
                    System.out.println("Введите ФИО абонента для поиска\n");
                    String findElement = scan.next();
                    person.stream().filter(x->x.getFullName().equals(findElement)).forEach(System.out::println);
                    break;
                }
                case "4": {
                    System.out.println("4 Вывод всех записей с сортировкой\n");
                    System.out.println("Выберите поле по которому будет производиться сортировка\n" +
                            "1 Сортировать по ФИО\n" +
                            "2 Сортировать по дате рождения\n");
                    String vibor = scan.next();
                    if (vibor.equals("1")) {
                        person.stream()
                                .sorted(Comparator.comparing(ElementBook::getFullName))
                                .forEach(System.out::println);
                    } else if (vibor.equals("2")) {
                        person.stream()
                                .sorted(Comparator.comparing(ElementBook::getDateOfDirth))
                                .forEach(System.out::println);
                    }
                    break;
                }
                case "5": {
                    System.out.println("5 Редактирование элемента\n");
                    System.out.println("Введите номер строки которую будете редактировать\n");
                    int nomberStr = scan.nextInt();
                    System.out.println("Введите новые данные\n");
                    nomberStr --;
                    ElementBook elementBook = SozdanieElementa();
                    person.set(nomberStr, elementBook);
                    System.out.println(person);
                    break;
                }
                case "6": {
                    System.out.println("6 Запись в файл всех данных\n");
                    String personsJson = mapper.writeValueAsString(person);
                    System.out.println(personsJson);
                    try (BufferedWriter writer = Files.newBufferedWriter(fileTelBook)) {
                            writer.write(personsJson);

                    }
                    catch (Exception ex){
                        System.out.println("Error with file write: " + ex);
                    }
                     break;
                }
                case "7": {
                    System.out.println("7 Загрузка из файла всех данных\n");
                    try (BufferedReader reader = Files.newBufferedReader(fileTelBook)) {
                        String strFile="",line;
                        while((line = reader.readLine()) != null) {
                            strFile=strFile+line;
                        }
                        System.out.println("Содержимое телефонной книги из файла.");
                        List<ElementBook> persons = mapper.readValue(strFile, new TypeReference<List<ElementBook>>() {});
                        System.out.println(persons);
                    } catch (Exception ex) {
                        System.out.println("Error with file read: " + ex);
                    }
                    break;
                }
                case "0":
                    zapusk = false;
                    break;
            }
        }

    }
}
