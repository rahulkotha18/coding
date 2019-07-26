class Solution {
    static List<String> list =new ArrayList<String>();
    public List<String> letterCasePermutation(String S) 
    {
        list.clear();
        int index=0,len=S.length();
        StringBuilder sb= new StringBuilder(S);
        list.add(S);
        loup(sb,index,len);
    return list;
    }
    public void loup(StringBuilder sb,int index,int len)
    {
        if(index<len)
        {        
            if(Character.isLetter(sb.charAt(index)))
            {
                sb.setCharAt(index,Character.toLowerCase(sb.charAt(index)));
                String a=sb.toString();
                if(!list.contains(a))
                    list.add(a);
                loup(sb,index+1,len);
                sb.setCharAt(index,Character.toUpperCase(sb.charAt(index)));
                a=sb.toString();
                if(!list.contains(a))
                    list.add(a);
                loup(sb,index+1,len);
            }
            else
                loup(sb,index+1,len);
        }
    }
}
