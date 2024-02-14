import java.util.*;
public class Tickets
{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        int Y=read.nextInt();
        int X=Y*4;
        if(X>1000)
        {
            System.out.println("NO");
        }
        else
        {
            System.out.println("YES");
        }
    }
}