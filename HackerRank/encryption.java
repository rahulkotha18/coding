/*
    Solution to the Encryption problem published on HackerRank.
    Problem Link: https://www.hackerrank.com/challenges/encryption/problem
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class encryption {
    static void encrypting(String s) {
        s.replaceAll(" ","");
        int max = (int) Math.ceil(Math.sqrt(s.length()));
        
	for(int i = 0; i < max; i++){
            for(int j = i; j < s.length(); j += max)
                System.out.print(s.charAt(j)+"");
            System.out.print(" " + "");
        }
    }

    public static void main(String args[]) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        encrypting(s);
        scanner.close();
    }
}
