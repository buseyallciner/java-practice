import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password;

        do {
            System.out.print("Enter password: ");
            password = sc.nextLine();
        } while (!password.equals("1234"));

        System.out.println("Login Successful!");
        sc.close();
    }
}
