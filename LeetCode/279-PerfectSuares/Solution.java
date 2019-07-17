class Solution {
    public int numSquares(int n)
    {
        if (n==0)
            return 0;
        if(n<=3)
            return n;
        int d[]=new int[n+1];
        d[0]=0;
        d[1]=1;
        d[2]=2;
        d[3]=3;
        int temp=0,k=0;
        for(k=4;k<=n;k++)
        {
            d[k]=k;
            for(int i=1;i<k;i++)
            {
                temp=i*i;
                if(temp>k)
                    break;
                else
                    d[k]=Math.min(d[k],1+d[k-temp]);
            }
        }
        return d[n];
    }
}
