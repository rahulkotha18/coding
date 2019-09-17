import java.util.*;
public class Paint
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        boolean flag=true;
        List<Integer> colors=new ArrayList();
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        colors.add(a[0]);
        for(int i=1;i<n;i++)
        {
            flag=true;
            int var=a[i];
            for(int b:colors)
            {
                if(var%b==0)
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
            {
                colors.add(var);
            }
        }
        System.out.println(colors.size());
    }
}
