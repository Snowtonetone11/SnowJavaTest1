import java.util.Arrays;
import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array");
        int numbers = sc.nextInt();
        int numArray[] = new int[numbers];

        int sum = 0;
        for (int i = 0; i < numArray.length; i++) {
            System.out.println("Enter element" + i);
            numArray[i] = sc.nextInt();
            sum = sum + numArray[i];
        }
        System.out.println(Arrays.toString(numArray));
        System.out.println("The sum of elements are " + sum);
    }
}
