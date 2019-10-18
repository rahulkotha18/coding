Short Problem Definition:
waiter

You are a waiter at a party. There are NN stacked plates. Each plate has a number written on it. You start picking up the plates from the top one by one and check whether the number written on the plate is divisible by a prime….

def solveWaiter(N, Q, numbers):
    stack = []
     
    for value in numbers:
        if value % generated_primes[0] != 0:
            stack.append(value)
        else:
            print value
     
     
    for prime_idx in xrange(1, Q):
        leftover = []
         
        while stack:
            value = stack.pop()
            if value % generated_primes[prime_idx] != 0:
                leftover.append(value)
            else:
                print value
        stack = leftover
     
    for value in stack:
        print value
 
def main():
    N, Q = map(int, raw_input().split())
     
    numbers = map(int, raw_input().split())
     
    solveWaiter(N, Q, numbers)
     
 
if __name__ == '__main__':
    main()