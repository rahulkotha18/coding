import java.util.*;
public class ExtraOne
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int p=0,n=0,x=0;
        for(int i=0;i<t;i++)
        {
             x=sc.nextInt();
             if(x<0)
                n++;
            else
                p++;
            if(p>1 && n>1)
                {
                    System.out.println("No");
                    return;
                }
            sc.nextInt();
        }
        System.out.println("Yes");
    }
}