/*James found a love letter that his friend Harry has written to his girlfriend. James is a prankster, so he decides to meddle with the letter. He changes all the words in the letter into palindromes.

To do this, he follows two rules:

He can only reduce the value of a letter by , i.e. he can change d to c, but he cannot change c to d or d to b.
The letter a may not be reduced any further.
Each reduction in the value of any letter is counted as a single operation. Find the minimum number of operations required to convert a given string into a palindrome.

For example, given the string , the following two operations are performed: cde → cdd → cdc.

Function Description

Complete the theLoveLetterMystery function in the editor below. It should return the integer representing the minimum number of operations needed to make the string a palindrome.

theLoveLetterMystery has the following parameter(s):

s: a string
Input Format

The first line contains an integer , the number of queries.
The next  lines will each contain a string .

Constraints


 | s | 
All strings are composed of lower case English letters, *ascii[a-z], with no spaces.

Output Format

A single line containing the minimum number of operations corresponding to each test case.

Sample Input

4
abc
abcba
abcd
cba
Sample Output

2
0
4
2*/
#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;


int main()
{
    string s;
    int t;
    cin>>t;
    
    while(t--)
    {
        cin>>s;
        int c=0;
        auto start=begin(s);
        auto last=end(s) - 1;
        while(start<last)
        {
            if(*start!=*last)
            {
                // if(*start>*last)
                // {
                //     *start=*last;
                // }
                // else
                // {
                //     *last=*start;
                // }
                c=c+abs(*last-*start);
                
            }
            
            start++;
            last--;
        }
        //cout<<s<<endl;
        cout<<c<<endl;
        
        
      
    }
    
}

