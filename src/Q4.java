import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = scanner.nextInt();

        System.out.println("Enter num2");
        int num2 = scanner.nextInt();

        if(num1>num2){
            System.out.println("Num1 is greater than num2.");
        } else if (num2>num1) {
            System.out.println("Num2 is greater than num1.");
        }else {
            System.out.println("Num1 and Num2 are equal.");
        }
    }
}
