package com.stencel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class Client {
    private int id;
    private String name, surname, gender;
    private String line = "";
    private String separator = ";";
    private String[] input;
    private static final int namesInFile = 1700;
    private static final int surnamesInFile = 2000;
    private String namesFilename = "../zad2/klienci/Imiona.txt";
    private String surnamesFilename = "../zad2/klienci/Nazwiska.txt";

    public Client(int id) {
        this.id = id;
        this.generateClient();
    }

    public void generateClient() {
        Random rand1 = new Random();
        Random rand2 = new Random();
        int nameNo = rand1.nextInt(namesInFile);
        int surnameNo = rand2.nextInt(surnamesInFile);

        int counter = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(namesFilename))) {
            while (counter < nameNo) {
                br.readLine();
                counter++;
            }
            line = br.readLine();
            input = line.split(separator);
            this.name = input[0];
            this.gender = input[1];
        } catch (IOException e) {
            e.printStackTrace();
        }
        counter = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(surnamesFilename))) {
            while (counter < surnameNo) {
                br.readLine();
                counter++;
            }
            this.surname = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printClient(){
        System.out.println(this.name + " " + this.surname + " " + this.gender);
    }
}
