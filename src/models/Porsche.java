package models;

public class Porsche extends MotorVehicle{

    public Porsche(String model, int year) {
        super(model,year);
    }

    @Override
    public void move(){
        System.out.println("from Porsche class");
    }
}