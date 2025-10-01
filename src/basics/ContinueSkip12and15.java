public class ContinueSkip12and15 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i == 12 || i == 15) continue;
            System.out.println(i);
        }
    }
}
