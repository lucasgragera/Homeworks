package models;

import java.util.Objects;

public class Audi extends MotorVehicle{

    public Audi(String model, int year) {
        super(model, year);
    }

    @Override
    public void move(){
        System.out.println("from Audi class");
    }
}
