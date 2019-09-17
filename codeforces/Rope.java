import java.util.*;
public class Rope
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[3];
        a[0]=sc.nextInt();
        a[1]=sc.nextInt();
        a[2]=sc.nextInt();
        int d=sc.nextInt();
        Arrays.sort(a);
        int sec=0;
        int d1=a[1]-a[0];
        int d2=a[2]-a[1];
        if( d1>=d && d2>=d )
        {
            System.out.println("0");
            return;
        }
        else if( d1 >=d )
        {
            System.out.println(d-d2);
        }
        else if( d2>=d )
        {
            System.out.println(d-d1);
        }
        else
        {
            sec+=d-d1;
            sec+=d-d2;
            System.out.println(sec);
        }
    }
}