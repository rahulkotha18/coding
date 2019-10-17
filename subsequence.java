import java.util.ArrayList;
import java.util.Scanner;

public class returnType{

    public static Scanner scn= new Scanner(System.in);
    
public static void main(String[] args)
 {
    String str ="ABCD";
System.out.println(subseq(str));
 }
 public static ArrayList<String> subseq(String str)
 {    if(str.length()==0)
      {
          ArrayList<String>base =new ArrayList<>();
          base.add(" ");
          return base;
      }
     char ch = str.charAt(0);
     String ros= str.substring(1);
     ArrayList<String> recAns= subseq(ros);
     ArrayList<String> myAns=new ArrayList<>();
     myAns.addAll(recAns);
     for(String s: recAns)
     {
         myAns.add(ch+s);
     }
     return myAns;
 }
}
