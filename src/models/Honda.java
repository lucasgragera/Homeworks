package models;

public class Honda extends MotorVehicle{

    // Constructor with parameters
    public Honda(String model, int year) {
        super(model, year);
    }

    @Override
    public void move(){
        System.out.println("from Honda class");
    }
}