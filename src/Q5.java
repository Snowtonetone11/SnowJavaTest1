import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write the number that you want to guess");
        int num = sc.nextInt();

        switch (num){
            case 1:
                System.out.println("Number is one.");
                break;
            case 2:
                System.out.println("Number is two.");
                break;
            case 3:
                System.out.println("Number is three.");
                break;
            default:
                System.out.println("Your guessing number is incorrect.");
        }
    }
}
