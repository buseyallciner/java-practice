public class SumFirstFive {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            sum = sum + i;
        }

        System.out.println("The sum of first five numbers is: " + sum);
    }
}
