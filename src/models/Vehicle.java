package models;

public abstract class Vehicle {
    private String model;
    private int year;
    private Wheel wheel;

    protected String getModel() {
        return model;
    }

    protected Vehicle(String model, int year) {
        this.model = model;
    }

    // Setter for model
    protected void setModel(String model) {
        this.model = model;
    }

    // Getter for year
    protected int getYear() {
        return year;
    }

    // Setter for year
    protected void setYear(int year) {
        this.year = year;
    }
    public abstract void move();
}