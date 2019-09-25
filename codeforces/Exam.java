import java.util.*;
public class Exam
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
        String s[]=new String[n];
        sc.nextLine();
        int tmarks=0;
        for(int i=0;i<n;i++)
        {
            s[i]=sc.nextLine();
        }
        int marks[]=new int[q];
        for(int i=0;i<q;i++)
        {
            marks[i]=sc.nextInt();
            int a[]=new int[5];
            for(int j=0;j<n;j++)
            {
                switch(s[j].charAt(i))
                {
                    case 'A':a[0]++;break;
                    case 'B':a[1]++;break;
                    case 'C':a[2]++;break;
                    case 'D':a[3]++;break;
                    case 'E':a[4]++;break;
                }
            }
            int max=1;
            for(int k=0;k<5;k++)
            {
                if(a[k]>max)
                {
                    max=a[k];
                }
            }
            tmarks+=(marks[i]*max);
        }
        System.out.println(tmarks);
    }
}