import java.util.Scanner;
public class Mian
{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        int X=read.nextInt();
        int Y=read.nextInt();
        int Z=read.nextInt();
        if(X>Y && X>Z)
        {
            System.out.println(X);
        }
        else if(Y>X && Y>Z)
        {
            System.out.println(Y);
        }
        else
        {
           System.out.println(Z); 
        }
        
    }
}