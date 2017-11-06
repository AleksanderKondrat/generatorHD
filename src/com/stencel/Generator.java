package com.stencel;

public class Generator {

    public Generator() {
        loadData();
    }

    private void loadData() {
        Data d = new Data();
        d.loadPlaces("C:/Users/aleks/Desktop/zad2/kursy/miejsca.txt");
        d.loadSports("C:/Users/aleks/Desktop/zad2/kursy/kursy.txt");
        d.loadCourse("C:/Users/aleks/Desktop/zad2/kursy/kitesurfing.txt");
        d.loadCourse("C:/Users/aleks/Desktop/zad2/kursy/narciarstwo.txt");
        d.loadCourse("C:/Users/aleks/Desktop/zad2/kursy/nurkowanie.txt");
        d.loadCourse("C:/Users/aleks/Desktop/zad2/kursy/paragliding.txt");
        d.loadCourse("C:/Users/aleks/Desktop/zad2/kursy/skydiving.txt");
        d.loadCourse("C:/Users/aleks/Desktop/zad2/kursy/snowboarding.txt");
        d.loadCourse("C:/Users/aleks/Desktop/zad2/kursy/snowkiting.txt");
        d.loadCourse("C:/Users/aleks/Desktop/zad2/kursy/wspinaczka.txt");

        d.print();


        //Tu dopisałem żeby pokazać przykład
        DateGenerator date = new DateGenerator();
        for (int Kolejny_numer=1;Kolejny_numer<10;Kolejny_numer++)
        System.out.println("Pesel: " + date.getRandomPESEL(Kolejny_numer));

        int rok=2016;
        String sezon=("zimowy");
        for (int i=1;i<10;i++)
            System.out.println("Data sezonu zimowego: " + date.GetRandomDate(2016,sezon));

    }
}
