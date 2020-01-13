import java.io.*;
import java.util.*;
import java.lang.*;
/*
In a parallel universe, there are not just two charges like positive and negative, but there are 26 charges represented by lower english alphabets.

Charges have a property of killing each other or in other words neutralizing each other if they are of same charge and next to each other.

You are given a string s where s[i] each represents a charge, where 0 < i < s - 1

You need to output of final size string followed by string after which no neutralizing is possible.

 */
class neutralisation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        StringBuilder input = new StringBuilder(br.readLine().trim());
        Stack<Character> outputStack = new Stack<>();
        StringBuilder output = new StringBuilder();
        for(int i = 0; i < input.length(); i++) {
            if(outputStack.isEmpty()) {
                outputStack.push(input.charAt(i));
            }
            else if(outputStack.peek() == input.charAt(i))
                outputStack.pop();
            else
                outputStack.push(input.charAt(i));
        }
        System.out.println(outputStack.size());
        while(outputStack.isEmpty() == false) {
            output.append(outputStack.pop());
        }
        System.out.println(output.reverse());
    }
}
