import java.util.Arrays;
import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array");
        int numbers = sc.nextInt();
        int numArray[] = new int[numbers];

        for (int i = numArray.length - 1; i >= 0; i--) {
            System.out.println("Enter elements ");
            numArray[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(numArray));
    }
}
