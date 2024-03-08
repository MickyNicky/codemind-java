import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int physics = scanner.nextInt();
        int chemistry = scanner.nextInt();
        int biology = scanner.nextInt();
        int mathematics = scanner.nextInt();
        int computerScience = scanner.nextInt();
        
        double totalMarks = physics + chemistry + biology + mathematics + computerScience;
        double percentage = (totalMarks / 500) * 100;
        
        char grade;
        
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else if (percentage >= 40) {
            grade = 'E';
        } else {
            grade = 'F';
        }
        
        System.out.println("Grade " + grade);
    }
}
