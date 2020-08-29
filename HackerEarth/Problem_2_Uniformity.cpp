/*******************************************
 * You are given a string that contains only three characters
 * , , and . You can change at the most  characters in the string.
 * The uniformity index of a string is defined by the maximum length 
 * of the substring that contains the same character. Your task is to
 * determine the maximum uniformity index than can be achieved.

Input format

First line: Two integers  and  where  denotes the size of the string and  as specified in the question
Second line: A string of length 
Output format
Print a single integer denoting the maximum uniformity that can be achieved.

Constraints
1<=N<=10^6
0<=K<=N

Sample Input                    Sample Output
8 1                               5
aabaacaa



Explanation
The array can be changed aaaaacaa to aabaaaaa .
**********************/

#include <iostream>
using namespace std;
#include<vector> 
#include<algorithm>
int main() {
	long n, k;
	long ans=0;
	scanf("%ld %ld",&n,&k);
	vector<long>v(3);
	char s[n];
	cin>>s;
	long l=0;
	long r=-1;
	long c1=0,c2=0,c3=0;
	while(l<n){
	
	while(r<n-1){
	     r++;
	    if(s[r]=='a')
	     c1++;
	    else if(s[r]=='b')
	     c2++;
	    else 
	      c3++;
	    v[0] = c1;
           v[1] = c2;
           v[2] = c3;
           sort(v.begin(),v.end());
           if((v[0]+v[1])>k)
               break;
           ans = max(ans,c1+c2+c3);
        
	}
	
	if(s[l]=='a')
	  c1--;
	else if(s[l]=='b')
	   c2--;
	else
	   c3--;
	 l++;
	}
	printf("%ld",ans);
	
	return 0;
}


