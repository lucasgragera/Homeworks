package exceptions;

import java.util.Scanner;

public class RunTimeException extends Exception{
    public runTimeException(String message){
        Scanner scanner = new Scanner(System.in);
        toString() a = scanner.nextInt();
        if (a= "android")
            throw new RunTimeException("Run Time Exception");
    }
    }
}