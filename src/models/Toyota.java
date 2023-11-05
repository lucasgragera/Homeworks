package models;

public class Toyota extends MotorVehicle{


    public Toyota(String model, int year) {
        super(model, year);
    }

    @Override
    public void move(){
        System.out.println("from Toyota class");
    }
}