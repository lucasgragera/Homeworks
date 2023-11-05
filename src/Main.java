import models.*;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Vehicle audi = new Audi("A1", 2022);
        Vehicle bmw = new Bmw("M3", 2020);
        Vehicle citroen = new Citroen("C4", 2021);
        Vehicle fiat = new Fiat("MOBI", 2018);
        Vehicle ford = new Ford("FIESTA", 2016);
        Vehicle honda = new Honda("CRV", 2022);
        Vehicle mercedesBenz = new MercedesBenz("AMG GTR", 2023);
        Vehicle porsche = new Porsche("911", 2023);
        Vehicle toyota = new Toyota("YARIS", 2023);

        doSmth(audi);
        doSmth(bmw);
        doSmth(citroen);
        doSmth(fiat);
        doSmth(ford);
        doSmth(honda);
        doSmth(mercedesBenz);
        doSmth(porsche);
        doSmth(toyota);
    }
    private static void doSmth(Vehicle vehicle){
        vehicle.move();
    }
}