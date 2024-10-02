package ain;

import java.util.Scanner;

public class electric {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the unit");
        int unit= in.nextInt();
        int bill;

        if (unit<150&&unit>100){
        bill = unit*7;
        System.out.println(bill);


    }
        if (unit<100) {
            bill = unit * 8;
            System.out.println(bill);

        }
        else {
            bill = unit*6;
            System.out.println(bill);
        }

    }
}
