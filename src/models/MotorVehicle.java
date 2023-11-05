package models;

public class MotorVehicle extends Vehicle{
    public MotorVehicle(String model, int year) {
        super(model, year);
    }
    private Engine engine;

    @Override
    public void move() {
        System.out.println("from MotorVehicle class");
    }
}