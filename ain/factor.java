package ain;

import java.util.Scanner;

public class factor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("typr the numbert");
        int num = in.nextInt();
        int i;
        for (i=1;i<=num;++i) {
            if (num % i == 0) {
                System.out.println(i+"");
            }
        }
    }
}
