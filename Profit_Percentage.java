import java.util.Scanner;
public class ProfitPercentage
{
    public static void main(String[] args)
    {
        Scanner read=new Scanner(System.in);
        double CP=read.nextDouble();
        double SP=read.nextDouble();
        double profit=SP-CP;
        double percentage=((profit*100)/CP);
        System.out.printf("%.2f",percentage);
    }
}