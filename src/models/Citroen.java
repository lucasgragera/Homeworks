package models;

import java.util.Objects;

public class Citroen extends MotorVehicle{
    public Citroen(String model, int year) {
        super(model, year);
    }

    @Override
    public void move(){
        System.out.println("from Citroen class");
    }

    //@Override
    //public int hashCode() {
    //    return Objects.hash(16, "Pirelli");
    //}
}