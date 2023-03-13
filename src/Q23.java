import java.util.Arrays;
import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array");
        int numbers = sc.nextInt();
        int numArray[] = new int[numbers];

        for ( int num : numArray) {
            System.out.println("Enter element ");
            num = sc.nextInt();
            System.out.println(num);
        }
    }
}
