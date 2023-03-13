import java.util.Arrays;
import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array");
        int numbers = sc.nextInt();
        int numArray[] = new int[numbers];
        int odd = 0;
        int even = 0;
        for (int i = 0; i < numArray.length; i++) {
            System.out.println("Enter element" + i);
            numArray[i] = sc.nextInt();
            if(numArray[i]%2==0){
                even++;
            }else {
                odd++;
            }
        }
        System.out.println(Arrays.toString(numArray));
        System.out.println("The count of even numbers are " + even);
        System.out.println("The count of odd numbers are " + odd);
    }
}
