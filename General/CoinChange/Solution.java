import java.util.*;
class Solution
{
    static List<Integer> s = new ArrayList<>();
    static Set<ArrayList<Integer>> hs = new HashSet();
    public static void main( String arg[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter number of coins :");
        int n=sc.nextInt();
        System.out.println("Enter each coin value in increasing order separated by space");
        while(n!=0)
        {
            n--;
            s.add(sc.nextInt());
        }
        int cur=0;
        ArrayList<Integer> l = new ArrayList();
        System.out.println("Enter target sum");
        int target=sc.nextInt(); 
        sum(cur,target,l);
        itr();
    }
    public static void itr()
    {
        Iterator i=hs.iterator();
        while(i.hasNext())
        System.out.println(i.next());
    }
    public static void sum(int cur , int target , ArrayList<Integer> l)
    {
        if(cur==target)
        {
            Collections.sort(l);
            hs.add(l);
            return;
        }
        for(int i:s)
        {
            if(cur+i > target)
                return;
            else
            {
                ArrayList<Integer> l1= new ArrayList(l);
                l1.add(i);
                sum(cur+i,target,l1);
            }
        }
    }
}
