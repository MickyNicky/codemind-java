import java.util.Scanner;
public class LossPercentage
{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        double CP=read.nextDouble();
        double SP=read.nextDouble();
        double loss=CP-SP;
        double percentage=((loss*100)/CP);
        System.out.printf("%.2f",percentage);
    }
}