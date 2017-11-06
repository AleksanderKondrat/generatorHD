package com.stencel;

public class Place {
    public String name, address, openingHour, closingHour;
    private int capacity;

    public Place(
            String name,
            String address,
            String capacity,
            String openingHour,
            String closingHour
    ) {
        this.name = name;
        this.address = address;
        this.capacity = Integer.parseInt(capacity);
        this.openingHour = openingHour;
        this.closingHour = closingHour;
    }
}
