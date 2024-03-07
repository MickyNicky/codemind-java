import java.util.Scanner;

public class CourseEnrollment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        int T = scanner.nextInt(); // Number of test cases

        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt(); // Size of the friend group
            int M = scanner.nextInt(); // Capacity of the course
            int K = scanner.nextInt(); // Number of students already registered for the course

            // Output
            System.out.println(canEnroll(N, M, K) ? "YES" : "NO");
        }

        scanner.close();
    }

    public static boolean canEnroll(int N, int M, int K) {
        return (M - K) >= N;
    }
}
