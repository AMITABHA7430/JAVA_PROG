package ain;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 fucking numbers: " );
        float num1 = input.nextFloat();
        float num2 = input.nextFloat();
        float num3 = input.nextFloat();

        float sum = num1 + num2 - num3;

        System.out.println("sum = " + sum);
    }

}
