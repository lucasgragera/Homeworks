package models;

public class Fiat extends MotorVehicle{

    public Fiat(String model, int year) {
        super(model, year);
    }

    @Override
    public void move(){
        System.out.println("from Fiat class");
    }
}