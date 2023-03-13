import java.util.Arrays;
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array");
        int numbers = sc.nextInt();
        int numArray[] = new int[numbers];

        for (int i = 0; i < numArray.length; i++) {
            System.out.println("Enter element" + i);
            numArray[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(numArray));

    }
}
