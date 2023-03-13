import java.util.Arrays;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array number");
        int array = sc.nextInt();
        int arrayNum[] = new int[array];

        for (int i = 0; i <arrayNum.length ; i++) {
            System.out.println("Enter element for each array");
             arrayNum[i] = sc.nextInt();
        }
        int largest = arrayNum[0];
        for (int i = 0; i < array; i++) {
            if(largest<arrayNum[i]){
                largest = arrayNum[i];
            }
        }
        System.out.println(Arrays.toString(arrayNum));
        System.out.println("The largest element is "+largest);
    }
}
