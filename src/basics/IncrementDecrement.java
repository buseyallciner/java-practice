import java.util.Scanner;

public class IncrementDecrement {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        num2 = sc.nextInt();

        System.out.println("After increment: " + (++num1));
        System.out.println("After decrement: " + (--num2));

        sc.close();
    }
}
