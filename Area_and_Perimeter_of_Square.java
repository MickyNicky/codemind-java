import java.util.Scanner;
public class Square
{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        int s=read.nextInt();
        int area=(s*s);
        int perimeter=(4*s);
        System.out.printf("%d %d",area,perimeter);
    }
}