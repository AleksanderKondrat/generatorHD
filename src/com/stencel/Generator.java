package com.stencel;

public class Generator {
    private static final int noOfClients = 100;
    private static final int initialClientId = 1;
    private Data d = new Data();

    public Generator() {
        loadData();
        d.generateClients(noOfClients, initialClientId);
        d.print();
    }

    private void loadData() {
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
    }
}
