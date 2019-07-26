class Solution {
    public int minCostClimbingStairs(int[] cost) 
    {
        int len=cost.length;
        int l1=cost[len-1],l2=cost[len-2],cur=0;
        for(int i=len-3;i>=0;i--)
        {
            cur=cost[i];
            cur=cur+Math.min(l1,l2);
            l1=l2;
            l2=cur;
        }
        return Math.min(l1,l2);
    }
}
