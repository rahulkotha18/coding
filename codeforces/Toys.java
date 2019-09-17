import java.util.*;
public class Toys
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n--!=0)
        {
            int eggs=sc.nextInt();
            int toys=sc.nextInt();
            int stickers=sc.nextInt();
            if(toys==stickers && toys==eggs)
                System.out.println("1");
            else if(toys+stickers==eggs)
                System.out.println(Math.max(toys,stickers)+1);
            else
            {
                System.out.println((eggs-Math.min(toys,stickers))+1);
            }
        }
    }
}
