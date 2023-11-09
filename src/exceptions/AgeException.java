package exceptions;

import java.util.Scanner;

public class AgeException extends Exception{
    public runTimeException(String message){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a<18)
            throw new AgeException("Age Exception");
    }
}
