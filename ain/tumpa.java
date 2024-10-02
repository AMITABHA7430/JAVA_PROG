package ain;

import java.util.Scanner;

public class tumpa {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        System.out.print("please enter temp in C:");
        byte tempC = (byte) in.nextFloat();

        byte tempF = (byte) ((tempC * 9/5) + 32);

        System.out.println(tempF);

    }
}
