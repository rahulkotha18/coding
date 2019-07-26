class Solution {
    public String toLowerCase(String str) {
     StringBuilder sb=new StringBuilder(str);
        for(int i=0;i<sb.length();i++)
        {
            if(Character.isUpperCase(sb.charAt(i)))
                sb.setCharAt(i,Character.toLowerCase(sb.charAt(i)));
        }
        return sb.toString();
    }
}
