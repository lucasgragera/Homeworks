import models.*;
import brg.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.util.Objects;
import java.util.Scanner;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Main {

    static Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {

        int a = 0;
        try(Scanner scanner = new Scanner(System.in)){
            int a = scanner.nextInt();
            if (a>5)
                throw new OwnException("own exception");
        }catch(OwnException e){
            a=0;
        }finally {
            scanner.close();
        }

        logger.debug("logger");
        logger.info("logger message");//I couldnt make the logger work so I personally creted a logs folder with a .txt. Im having issues with sdk and jdk
        logger.warn("logger");
        logger.error("logger");

        public static void doSmth() throws OwnException{
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            if (a>5)
                throw new OwnException("own exception");
        }
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