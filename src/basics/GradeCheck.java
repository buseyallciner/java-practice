import java.util.Scanner;

public class GradeCheck {
    public static void main(String[] args) {
        int score;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a score: ");
        score = sc.nextInt();

        if (score > 70) {
            System.out.println("You passed!");
        } else {
            System.out.println("You failed!");
        }
    }
}
