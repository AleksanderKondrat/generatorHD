package com.stencel;

public class CoursePart {
    private String id;
    private int duration;

    public CoursePart(String id, int duration) {
        this.id = id;
        this.duration = duration;
    }

    public void printCoursePart() {
        System.out.println(id + " " + duration);
    }
}
