import java.util.Scanner;
public class Swap
{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        int x=read.nextInt();
        int y=read.nextInt();
        int temp;
        temp=x;
        x=y;
        y=temp;
        System.out.println(x);
        System.out.println(y);
    }
}