package ain;



import java.util.Scanner;

public class swch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String day= in.next();

//        if (fruit.equals("mango")){
//            System.out.println("king of fruit");
//        }
//        if (fruit.equals("apples")){
//            System.out.println("kasmiri apple best");
//
//
//        }
//        if (fruit.equals("graps")){
//            System.out.println("my fav");
//
//        }
//        switch (fruit) {
//            case "mango":
//                System.out.println("king of fruit");
//                break;
//            case "apple":
//                System.out.println("KASMIRI APPLE BEST");
//                break;
//            case "graps":
//                System.out.println("smallfruit green in color");
//                break;
//            case "soumadeep":
//                System.out.println("chutya");


//        }
        System.out.println("hello chutyo");
        System.out.println("enter the day no.");
        int day = in.nextInt();
        switch (day) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("tursday");
                break;

            case 5:
                System.out.println("saturday");
                break;
            case 6:
                System.out.println("sunday");




        }
    }
}
