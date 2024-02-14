import java.util.*;
public class LuckyCharacter
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().trim();
        char lucky=s.charAt(6);
        System.out.println(lucky);
    }
}