package com.stencel;

import java.util.ArrayList;

public class Sport {
    private String discipline, shortName, season;
    private int payForPoc, payForSre, payForZaw;
    private ArrayList<Course> courses = new ArrayList<>();
    private ArrayList<String> names = new ArrayList<>();
    private static final int maxPart = 3;
    private static final int costToPayRatio = 3;

    public Sport(
            String discipline,
            String shortName,
            String season,
            String payForPoc,
            String payForSre,
            String payForZaw
    ) {
        this.shortName = shortName;
        this.discipline = discipline;
        this.season = season;
        this.payForPoc = Integer.parseInt(payForPoc);
        this.payForSre = Integer.parseInt(payForSre);
        this.payForZaw = Integer.parseInt(payForZaw);
    }

    public void addCourse(String id, String duration) {
        String courseName = id.substring(0, 7);
        if (!names.contains(courseName)) {
            int cost = 0, pay = 0;
            String level = id.substring(4, 7);
            switch (level) {
                case "POC": level = "poczatkujacy"; pay = this.payForPoc; break;
                case "SRE": level = "sredniozaawansowany"; pay = payForSre; break;
                case "ZAW": level = "zaawansowany"; pay = payForZaw; break;
            }
            cost = pay * costToPayRatio;
            courses.add(new Course(courseName, this.discipline, level, this.season, pay, maxPart, cost));
            names.add(courseName);
        }
        for (Course c:courses
             ) {
            if (c.getName().equals(courseName)) {
                c.addCoursePart(id, duration);
                break;
            }
        }
    }

    public String getShortName() {
        return this.shortName;
    }

    public void printSport() {
        System.out.println(this.shortName);
        for (Course c:courses
             ) {
            c.printCourse();
        }
    }
}
