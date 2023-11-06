package models;

import models.interfaces.IEnjoy;
import models.interfaces.ITravel;

public class Truck {

    public static <Strings> void main(Strings[] args){
        IEnjoy MercedesBenz = new MercedesBenz();
        ITravel Honda = new Honda();

        MercedesBenz.enjoy();
        Honda.travel();
        doSmth();
    }
    public static void doSmth(){

    }
}
