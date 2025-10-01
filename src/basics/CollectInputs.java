import java.util.Scanner;

public class CollectInputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder entered = new StringBuilder();

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number " + i + ": ");
            int n = sc.nextInt();
            entered.append(n).append(' ');
        }

        sc.close();
        System.out.println("Entered numbers: " + entered.toString().trim());
    }
}
