package com.stencel;

/**
 * Created by Aleksander on 06.11.2017.
 */
public class Date {
    private int year;
    private int month;
    private int day;

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void setDate(Date newDate){
        this.day = newDate.day;
        this.month = newDate.month;
        this.year = newDate.year;
    }
    public String getDate(){
        //System.out.println(this.year + "-" + this.month + "-" + this.day);
        String nweDate = (String.format("%02d",this.year) + "-" + String.format("%02d",this.month) + "-" + String.format("%02d",this.day));
        return nweDate;
    }
    public String getDateToPESEL(){
        System.out.println("Data do Peselu "+String.format("%02d",this.year) + "-" + String.format("%02d",this.month) + "-" + String.format("%02d",this.day));
        String nweDate = (String.format("%02d",(this.year-1900)) + String.format("%02d",this.month) + String.format("%02d",this.day));
        return nweDate;
    }

}
