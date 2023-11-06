package models;

public abstract class Vehicle{

    public static final count = 20;
    private String model;
    private int year;
    private Wheel wheel;

    public Vehicle() {

    }

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

    public abstract void vehicle();
}