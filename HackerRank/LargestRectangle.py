Short Problem Definition:

There are NN buildings in a certain two-dimensional landscape. Each building has a height given by hi,i∈[1,N]hi,i∈[1,N]. If you join KK adjacent buildings, they will form a solid rectangle of area K×min(hi,hi+1,…,hi+k−1)K×min(hi,hi+1,…,hi+k−1).

Given NN buildings, find the greatest such solid area formed by consecutive buildings.

def computeLargestArea(hist, N):
    stack = []
     
    max_area = 0
     
    idx = 0
    while (idx < N):
        if not stack or hist[stack[-1]] <= hist[idx]:
            stack.append(idx)
            idx += 1
        else:
             
            height_idx = stack.pop()
             
            depth = idx
            if stack:
                depth = idx - stack[-1] - 1
             
            area = hist[height_idx] * depth
            max_area = max(area, max_area)
      
    while stack:
        height_idx = stack.pop()
             
        depth = idx
        if stack:
            depth = idx - stack[-1] - 1
             
        area = hist[height_idx] * depth
        max_area = max(area, max_area)
             
    return max_area
 
def main():
    N = int(raw_input())
     
    hist = map(int, raw_input().split())
     
    print computeLargestArea(hist, N)
     
 
 
if __name__ == '__main__':
    main()