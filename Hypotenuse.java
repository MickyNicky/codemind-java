import java.util.Scanner;
public class Triangle
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        double z=Math.sqrt((x*x)+(y*y));
        System.out.printf("%.2f",z);
}
}