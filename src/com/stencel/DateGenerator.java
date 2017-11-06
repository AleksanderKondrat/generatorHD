package com.stencel;

import java.util.Random;

/**
 * Created by Aleksander on 06.11.2017.
 */
public class DateGenerator {
    private int year;
    private int month;
    private int day;
    //private int hours;
    //private int number;
    private int bornYearStart=1930;
    private int bornYearEnd=1998;
    //private int bornMonthStart=1930;
    //private int bornMonthEnd=1999;

    public Date GetRandomDate(Integer  startYear, Integer stopYear, Integer  startMonth, Integer stopMonth) {
        Date newDate = new Date();

        this.year=randomYear(startYear,stopYear);
        newDate.setYear(this.year);

        this.month=randomMonth(startMonth,stopMonth);
        newDate.setMonth(this.month);

        this.day=randomDay(this.month,this.year);
        newDate.setDay(this.day);

        return newDate;
    }

    public String GetRandomDate(Integer  startYear, String season) {
        Date newDate = new Date();
        int startMonth;
        int stopMonth;

        newDate.setYear(startYear);

        switch (season){
            case "zimowy":
            {
                Random r=new Random();
                startMonth=r.nextInt(3);
                switch (startMonth) {
                    case 0: {
                        newDate.setMonth(12);
                        break;
                    }
                    case 1: {
                        newDate.setMonth(1);
                        break;
                    }
                    case 2: {
                        newDate.setMonth(2);
                        break;
                    }
                }
                break;
            }
            case "letni":
            {
                startMonth =5;
                stopMonth=8;
                this.month=randomMonth(startMonth,stopMonth);
                newDate.setMonth(this.month);
                break;
            }
            case "caloroczny":
            {
                startMonth =1;
                stopMonth=12;
                this.month=randomMonth(startMonth,stopMonth);
                newDate.setMonth(this.month);
                break;

            }
            default:{
                startMonth =1;
                stopMonth=12;
                this.month=randomMonth(startMonth,stopMonth);
                newDate.setMonth(this.month);
                break;
            }

        }

        this.day=randomDay(this.month,this.year);
        newDate.setDay(this.day);

        return newDate.getDate();
    }


    public int randomYear(Integer  startYear, Integer stopYear){
        int differenceYear =stopYear-startYear;
        Random r=new Random();
        int year=r.nextInt(differenceYear)+startYear;
        return year;

    }

    public int randomMonth(Integer  startMonth, Integer stopMonth){
        int differenceMonth =stopMonth-startMonth;
        Random r=new Random();
        int month=r.nextInt(differenceMonth)+startMonth;
        return month;
    }

    public int randomDay(Integer  Month, Integer Year){
        Integer differenceDay;
        if (Month==1 || Month==3 || Month==5 || Month==7 || Month==8 || Month==10 || Month==12)
        differenceDay = 30;
        else if(Month==4 || Month==6 || Month==9 || Month==11)
            differenceDay = 29;
        else if(Year%4==0)
            differenceDay = 27;
        else
            differenceDay = 28;
        Random r=new Random();
        int day=r.nextInt(differenceDay)+1;
        return day;
    }

    public String getRandomPESEL(Integer NextNumber){
        Date newDate = new Date();
        newDate.setDate(GetRandomDate(this.bornYearStart,this.bornYearEnd,1,12));
        String SNextNumber= String.format("%05d",NextNumber);
        String newPESEL=newDate.getDateToPESEL()+SNextNumber;
        return newPESEL;
    }




}
