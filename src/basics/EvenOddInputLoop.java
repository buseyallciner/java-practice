import java.util.Scanner;

public class EvenOddInputLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number " + i + ": ");
            int n = sc.nextInt();

            if (n % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }

        sc.close();
    }
}

