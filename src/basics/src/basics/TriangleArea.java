import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        int base;
        int height;
        double area;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Triangle Area Calculator!");
        System.out.print("Enter the base value: ");
        base = scanner.nextInt();

        System.out.print("Enter the height value: ");
        height = scanner.nextInt();

        area = (base * height) / 2.0;
        System.out.println("The area of the triangle is: " + area);
    }
}
