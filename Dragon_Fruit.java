import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        
        // Check if X is divisible by 2 and greater than 2, because 0 and 1 are not considered even numbers
        if (X % 2 == 0 && X > 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
