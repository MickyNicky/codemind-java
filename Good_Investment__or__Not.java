import java.util.Scanner;

public class Investment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        int X = scanner.nextInt(); // Interest rate
        int Y = scanner.nextInt(); // Inflation rate

        // Output
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
