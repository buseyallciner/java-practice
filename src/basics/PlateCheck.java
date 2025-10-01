import java.util.Scanner;

public class PlateCheck {
    public static void main(String[] args) {
        int plate;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a plate number: ");
        plate = sc.nextInt();

        if (plate == 34) {
            System.out.println("Istanbul");
        } else if (plate == 33) {
            System.out.println("Mersin");
        } else if (plate == 6) {
            System.out.println("Ankara");
        } else {
            System.out.println("Not found");
        }
    }
}
