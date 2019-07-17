class Solution
{
     public boolean stoneGame(int[] piles)
    {
        int a=0;
        for(int i:piles)
            a=a^i;
         return a==0?false:true;
    }
}
