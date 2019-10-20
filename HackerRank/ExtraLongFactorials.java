/*
    Solution to the 'Extra Long Factorials' problem published on HackerRank.
    Problem Link: https://www.hackerrank.com/challenges/extra-long-factorials/problem
 */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ExtraLongFactorials {
    static BigInteger x;

    static BigInteger extraLongFactorials(int n) {
        for(n = n - 1; n > 1; n--)
            x = x.multiply(BigInteger.valueOf(n));
        return x;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        x = new BigInteger(Integer.toString(n));
        
        System.out.println(extraLongFactorials(n));
        
        scanner.close();
    }
}