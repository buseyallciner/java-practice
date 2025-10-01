import java.util.Scanner;

public class AdditionLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print(i + ". trial - Enter first number: ");
            int a = sc.nextInt();

            System.out.print(i + ". trial - Enter second number: ");
            int b = sc.nextInt();

            System.out.println("Sum = " + (a + b));
            System.out.println("-------------------------");
        }

        sc.close();
    }
}
