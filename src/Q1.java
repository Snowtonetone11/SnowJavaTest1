import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        int factorial=1;
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}
