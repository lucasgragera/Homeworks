package exceptions;

import java.util.Scanner;

public class DisplaySizeException extends Exception{
    public runTimeException(String message){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a<15)
            throw new DisplaySizeException("Screen Size Exception");
    }
}
}