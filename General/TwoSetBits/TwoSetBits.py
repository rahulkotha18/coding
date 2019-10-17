'''Look at the following sequence:
   3, 5, 6, 9, 10, 12, 17, 18, 20....
All the numbers in the series has exactly 2 bits set in their binary representation. Your task is simple, you have to find the Nth number of this sequence. Since the number can be very large, print number % 1000000007. '''



import math


M = 1000000007

def power(a,b):
    ans = 1
    while b>0:
        if b&1==1:
            ans = (ans*a)%M
        a = (a*a)%M
        b = b>>1
    return ans




t = int(input())

while t>0:
    t-=1
    n = int(input()) 
    r = (int(math.sqrt((n*8)-1))+1)//2
    i = n-((r*(r-1))//2)-1
        
    print( (power(2,r)%M + power(2,i)%M )%M)
    
