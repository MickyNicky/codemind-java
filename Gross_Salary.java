import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int basicSalary = scanner.nextInt();
        
        double da, hra;
        
        if (basicSalary <= 10000) {
            da = 0.8 * basicSalary;
            hra = 0.2 * basicSalary;
        } else if (basicSalary <= 20000) {
            da = 0.9 * basicSalary;
            hra = 0.25 * basicSalary;
        } else {
            da = 0.95 * basicSalary;
            hra = 0.3 * basicSalary;
        }
        
        double grossSalary = basicSalary + da + hra;
        System.out.printf("%.2f", grossSalary);
    }
}
