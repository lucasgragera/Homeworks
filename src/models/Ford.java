package models;

public class Ford extends MotorVehicle{
    public Ford(String model, int year) {
        super(model, year);
    }

    @Override
    public void move(){
        System.out.println("from Ford class");
    }
}