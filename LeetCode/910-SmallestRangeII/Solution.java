class Solution {
    public int smallestRangeII(int[] A, int K) {
        if(A.length == 1) return 0;

        Arrays.sort(A);

        int res = A[A.length - 1] - A[0];

        for(int i = 0; i < A.length - 1; i++){
            int min = Math.min(A[0] + K, A[i + 1] - K);
            int max = Math.max(A[A.length - 1] - K, A[i] + K);
            res = Math.min(res, max - min);
        }

        return res;
    }
}