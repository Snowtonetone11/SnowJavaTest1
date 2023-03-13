import java.util.Arrays;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array numbers");
        int arrays = sc.nextInt();
        int arrayNum[] = new int[arrays];

        for (int num = 0; num < arrayNum.length; num++) {
            System.out.println("Enter elements for arrays");
            arrayNum[num]=sc.nextInt();
            System.out.println(arrayNum[num]+2);
        }
    }
}
