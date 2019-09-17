import java.util.*;
public class Exp
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int res=0;
        if(a+b+c==3)
        {
            System.out.println("3");
            return;
        }
        if(a==1)
            res=(a+b);
        else
            res=(a*b);
        if(b==1)
        {
            if(a>c)
                res=a*(b+c);
            else
                res=(a+b)*c;
            System.out.println(res);
            return;
        }
        if(c==1)
        {
            if(a==1)
                res=a+(b+c);
            else
                res=a*(b+c);
            System.out.println(res);
            return;
        }
        else
            res*=c;
        System.out.println(res);
            return;
    }
}