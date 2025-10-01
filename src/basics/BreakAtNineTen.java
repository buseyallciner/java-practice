public class BreakAtNineTen {
    public static void main(String[] args) {
        for (int i = 1; i <= 30; i++) {
            if (i == 9 || i == 10) {
                System.out.println("Program ended (number " + i + " reached).");
                break;
            }
            System.out.println(i);
        }
    }
}
