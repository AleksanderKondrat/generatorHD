package com.stencel;

import java.util.ArrayList;

public class Course {
    private String name, discipline, level, season;
    private int pay, maxPart, cost;
    private ArrayList<CoursePart> courseParts = new ArrayList<>();

    public Course(
            String name,
            String discipline,
            String level,
            String season,
            int pay,
            int maxPart,
            int cost
    ) {
        this.name = name;
        this.discipline = discipline;
        this.level = level;
        this.season = season;
        this.pay = pay;
        this.maxPart = maxPart;
        this.cost = cost;
    }

    public void addCoursePart(String id, String duration) {
        courseParts.add(new CoursePart(id, Integer.parseInt(duration)));
    }

    public String getName() {
        return this.name;
    }

    public void printCourse() {
        System.out.println(this.name + " " + this.discipline + " " + this.level);
        for (CoursePart cp:courseParts
             ) {
            cp.printCoursePart();
        }
    }
}
