import java.lang.Math;
class Solution {
    public int trap(int[] h) {
        int len=h.length;
        if(len<=1)
            return 0;
        int a[]=new int[len];
        int b[]=new int[len];
        int min=h[0],sum=0,max=h[len-1],i=0;
        for(i=0;i<len;i++)
        {
            if(h[i]>min)
              min=h[i]; 
            a[i]=min;
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for(i=len-1;i>=0;i--)
        {
            if(h[i]>max) 
                max=h[i];
             b[i]=max;
            System.out.print(b[i]+" ");
        }
        for(i=0;i<len;i++)
          sum+=h[i]-Math.min(a[i],b[i]);
        return -sum;
    }
}
