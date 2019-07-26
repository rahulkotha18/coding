class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> l= new ArrayList<Integer>();
        boolean flag=true;
        for(int i=left;i<=right;i++)
        {
            int j=i;
            flag=true;
            while(j>0)
            {
                int k=j%10;
                if(k==0 || i%k!=0)
                {
                    flag=false;
                    break;
                }
                j=j/10;
            }
            if(flag)
                l.add(i);
        }
        return l;
    }
}
