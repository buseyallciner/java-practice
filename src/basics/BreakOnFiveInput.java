import java.util.Scanner;

public class BreakOnFiveInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number " + i + ": ");
            int n = sc.nextInt();

            if (n == 5) {
                System.out.println("Program terminated (5 was entered).");
                break;
            }
        }

        sc.close();
    }
}
