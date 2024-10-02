package ain;

import java.sql.SQLOutput;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("enter number upto factorial");
//        int n = in.nextInt();
//        int fact = 1;
//        int i;

        Scanner in = new Scanner(System.in);
        System.out.println("Gand marao: ");
        int n = in.nextInt();
        int fact = 1;
        for (int i=1;i<=n;++i){
//            System.out.println(i);
            fact = fact * i;

        }

        System.out.println(fact);


    }
}
