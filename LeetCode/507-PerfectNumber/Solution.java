class Solution {
    public boolean checkPerfectNumber(int num) 
    {
        if(num<=0)
            return false;
        int n=0;
        for(int i=1;i*i<=num;i++)
        {
            if(num%i==0)
            {
                n+=i;
                if(i*i!=num)
                    n=n+(num/i);
            }
        }
        return n-num==num;
    }
}
