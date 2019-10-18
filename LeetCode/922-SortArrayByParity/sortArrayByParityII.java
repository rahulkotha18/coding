/*original LeetCode problem can be found here:
https://leetcode.com/problems/sort-array-by-parity-ii/ */

class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int i = 0;
        int j = 1;
        while(i < A.length && j < A.length) {
          while(i < A.length && A[i] % 2 == 0){
            i += 2;
        }
        while (j < A.length && A[j] % 2 == 1) {
          j += 2;
        }
        if (i < A.length && j < A.length) {
          int n = A[i];
          A[i] = A[j];
          A[j] = n;
        }
    }
    return A;
  }
}
