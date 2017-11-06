package com.stencel;

public class Generator {

    public Generator() {
        loadData();
    }

    private void loadData() {
        Data d = new Data();
        d.loadPlaces("../zad2/miejsca.txt");

        d.loadSports("../zad2/kursy/kursy.txt");

        d.loadCourse("../zad2/kursy/kitesurfing.txt");
        d.loadCourse("../zad2/kursy/narciarstwo.txt");
        d.loadCourse("../zad2/kursy/nurkowanie.txt");
        d.loadCourse("../zad2/kursy/paragliding.txt");
        d.loadCourse("../zad2/kursy/skydiving.txt");
        d.loadCourse("../zad2/kursy/snowboarding.txt");
        d.loadCourse("../zad2/kursy/snowkiting.txt");
        d.loadCourse("../zad2/kursy/wspinaczka.txt");

        d.print();
    }
}
