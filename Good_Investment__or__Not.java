import java.util.Scanner;

public class Investment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        System.out.println(isInvestmentGood(X, Y));
        scanner.close();
    }
    public static String isInvestmentGood(int X, int Y) {
        if (X >= 2 * Y) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
