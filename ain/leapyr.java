package ain;

import java.util.Scanner;

public class leapyr {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("radius of circle");
        int radius = in.nextInt();
        float area;
        System.out.println("area of the circle is--");

        area = (float) (radius * radius * 3.14);
        System.out.println(area);

    }
}
