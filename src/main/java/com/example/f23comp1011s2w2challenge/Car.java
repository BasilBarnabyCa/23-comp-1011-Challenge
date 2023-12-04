package com.example.f23comp1011s2w2challenge;

public class Car implements Comparable<Car> {
    private String make, model, colour;
    private int year;

    public Car(String make, String model, String colour, int year) {
        setMake(make);
        setModel(model);
        setColour(colour);
        setYear(year);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int compareTo(Car o) {
        if (this.make.compareTo(o.make) == 0)
            return this.model.toLowerCase().compareTo(o.model.toLowerCase());
        else
            return this.make.compareTo(o.make);
    }

    @Override
    public String toString() {
        return String.format("%d %s %s %s", year, make, model, colour);
    }
}
