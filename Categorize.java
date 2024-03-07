import java.util.Scanner;

public class HeightCategorization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input height in centimetersentimeters: ");
        double height = scanner.nextDouble();

        // Categorize based on height
        if (height < 150.0) {
            System.out.println("Person is Dwarf.");
        } else if (height <= 165.0) {
            System.out.println("Person is average heighted.");
        } else if (height <= 195.0) {
            System.out.println("Person is taller.");
        } else {
            System.out.println("Abnormal height.");
        }

        scanner.close();
    }
}
