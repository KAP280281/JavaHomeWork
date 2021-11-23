package com.pb.kravets.hw9;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

public class FileNumbers {
    static Path numbers=Paths.get("c:\\Users\\Александр\\IdeaProjects\\JavaHomeWork\\files\\numbers.txt");
    static Path oddnumbers=Paths.get("c:\\Users\\Александр\\IdeaProjects\\JavaHomeWork\\files\\odd-numbers.txt");
    public static void main(String[] args) throws IOException {

        createNumbersFile();
        createOddNumbersFile();
    }

    public static void createNumbersFile(){

       try (BufferedWriter writer = Files.newBufferedWriter(numbers)) {
           String result = "";
           Random random = new Random();
           for (int j = 0; j < 10; j++) {
               for (int i = 0; i < 10; i++) {
                   result += String.valueOf(random.nextInt(100)) + " ";
               }
               writer.write(result);
               writer.write("\n");
               result = "";
           }
       }
       catch (Exception ex){
           System.out.println("Error with file write: " + ex);
       }
       finally {
           try (BufferedReader reader = Files.newBufferedReader(numbers)) {
               String line;
               System.out.println("Содержимое файла numbers.txt:");
               while((line = reader.readLine()) != null) {
                   System.out.println(line);
               }
               System.out.println("-----------------------------------");
           } catch (Exception ex) {
               System.out.println("Error with file read: " + ex);
           }
       }
    }
    public static void createOddNumbersFile(){
        try (BufferedReader reader = Files.newBufferedReader(numbers);BufferedWriter writer = Files.newBufferedWriter(oddnumbers)) {
            String line;
            String result1="";
            while ((line = reader.readLine()) != null) {
                String[] strings = line.split(" ");
                for (String str : strings) {
                    Integer foo = Integer.parseInt(str);
                    if(foo % 2==0){
                        foo=0;
                    }
                    result1 += String.valueOf((foo) + " ");
                }
                writer.write(result1);
                writer.write("\n");
                result1 = "";
            }
        }
        catch (Exception ex) {
            System.out.println("Error with file read: " + ex);
        }
        finally {
            try (BufferedReader reader = Files.newBufferedReader(oddnumbers)) {
                String line;
                System.out.println("Содержимое файла odd-numbers.txt:");
                while((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
                System.out.println("-----------------------------------");
            } catch (Exception ex) {
                System.out.println("Error with file read: " + ex);
            }
        }
    }
}
