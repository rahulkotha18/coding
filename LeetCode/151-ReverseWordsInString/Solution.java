    public String reverseWords(String s) {
        int i=0;
        String words[]=s.split(" ");
        StringBuilder rev=new StringBuilder();
        boolean flag=false;
        for(i=words.length-1;i>=0;i--)
        {
            if(words[i].equals(""))
                continue;
            if(flag==false)
            {   flag=true;
                rev.append(words[i]);
            }
             else
                rev.append(" "+words[i]);
        }
        return rev.toString();
        }
}

