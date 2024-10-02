package ain;

import java.util.Scanner;

public class summ {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int sum = 0;
        int x = 0;

        do {
            System.out.println("Please insert a number: ");
            x = in.nextInt();


            sum += x;
            System.out.println(sum);

        } while (x > 0);

        System.out.println("no data was entered");

    }
}
