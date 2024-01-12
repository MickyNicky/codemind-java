 import java.util.Scanner;
 public class Taps
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int X=sc.nextInt();
        int Y=sc.nextInt();
        int c=((X*Y)/(X+Y));
    System.out.print(c);
    }
}