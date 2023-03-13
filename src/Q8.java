import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array");
        int array = sc.nextInt();
        int arrayNum[] = new int[array];

        for (int i = 0; i < arrayNum.length; i++) {
            System.out.println("Enter first column value");
            arrayNum[i]=sc.nextInt();
            for (int j = 0; j < arrayNum[i]; j++) {
                System.out.println("Enter second column value");

            }
        }

    }
}
