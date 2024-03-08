import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X1 = scanner.nextInt();
        int X2= scanner.nextInt();
        int Y1=scanner.nextInt();
        int Y2=scanner.nextInt();
        int a=X1+X2;
        int b=Y1+Y2;
        if (a<=b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
