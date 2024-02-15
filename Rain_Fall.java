import java.util.*;
public class CodeMind
{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        int X=read.nextInt();
        if(X<3)
        {
            System.out.println("LIGHT");
        }
        else if(X>=3 && X<7)
        {
            System.out.println("MODERATE");
        }
        else
        {
            System.out.println("HEAVY");
        }
    }
}