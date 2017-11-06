package com.stencel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Data {
    private ArrayList<Place> places = new ArrayList<>();
    private ArrayList<Sport> sports = new ArrayList<>();
    private String line = "";
    private String separator = ";";
    private String[] input;

    public void loadPlaces(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            skipFirstLine(br);
            while ((line = br.readLine()) != null) {
                input = line.split(separator);
                places.add(new Place(input[0],input[1],input[2],input[3],input[4]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadSports(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            skipFirstLine(br);
            while ((line = br.readLine()) != null) {
                input = line.split(separator);
                sports.add(new Sport(input[0],input[1],input[2],input[3],input[4],input[5]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadCourse(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            skipFirstLine(br);
            while ((line = br.readLine()) != null) {
                input = line.split(separator);
                for (Sport s:sports
                     ) {
                    if (input[0].startsWith(s.getShortName())) {
                        s.addCourse(input[0], input[1]);
                        break;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void print() {
        for (Place p:places
             ) {
            System.out.println(p.name + " " + p.address);
        }
        for (Sport s:sports
                ) {
            s.printSport();
        }
    }

    private void skipFirstLine(BufferedReader br) throws IOException {
        br.readLine(); //ominiecie 1-szego wiersza
    }
}