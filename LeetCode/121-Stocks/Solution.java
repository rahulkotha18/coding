class Solution
{
    public int maxProfit(int[] p)
    {
        int l=p.length;
        if(l<=1)
            return 0;
        int min=p[0],max=0;
        for(int i=0;i<l;i++)
        {
            if(min>p[i])
                min=p[i];
            else if(p[i]-min>max)
                max=p[i]-min;
        }
        return max;
    }
}
