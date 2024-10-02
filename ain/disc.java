package ain;

import java.util.Scanner;

public class disc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the price");
        int price = in.nextInt();
        System.out.println("enter discount");
        float discount = in.nextInt();
        float finalprice;
        float discprice;
        float n;
        n = discount / 100;

        discprice = price * n;
        finalprice = price - discprice;
        System.out.println(finalprice);




    }
}
