# Problem : https://codeforces.com/contest/1092/problem/B

n = int(input())
 
a = list(map(int,input().split()))
 
a = sorted(a)
 
count =0
i = 1
 
while i<n:
    count+=a[i]-a[i-1]
    i+=2
print(count)    
