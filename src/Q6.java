import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fruit name that you want to guess");
        String fruit = sc.nextLine();

        switch (fruit){
            case "Banana":
                System.out.println("This is Banana");
                break;
            case "Apple":
                System.out.println("This is Apple");
                break;
            case "Orange":
                System.out.println("This is Orange");
                break;
            default:
                System.out.println("Incorrect fruit Name");
        }
    }
}
