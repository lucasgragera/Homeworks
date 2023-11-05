package models;

public class MercedesBenz extends MotorVehicle{
    public MercedesBenz(String model, int year) {
        super(model, year);
    }

    @Override
    public void move(){
        System.out.println("from MercedesBenz class");
    }
}