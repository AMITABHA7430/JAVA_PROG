package ain;
import java.util.Scanner;
public class avg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number of input");
        int N = in.nextInt();
        int sum = 0;
        int avarg = 0;
        for (int i=0;i<=N-1;i++){
            System.out.println("Enter "+N+" no of input motherfucker:");
           int num1 = in.nextInt();
           sum = sum + num1;
           avarg = sum/N;

        }
        System.out.println(avarg);

    }
}
