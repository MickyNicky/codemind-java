import java.util.*;
public class Codemind
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int X=sc.nextInt();
        int Y=sc.nextInt();
        int Z=X*5;
        if(Z>=Y)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}