class Solution {
    public int findCircleNum(int[][] M) {
        int subsets[] = new int[M.length];
        for(int i = 0; i < subsets.length; i++){
            subsets[i] = -1;
        }
        for(int i = 0; i < M.length; i++){
            for(int j = 0; j < M[0].length; j++){
                if(i == j) continue;
                if(M[i][j] == 1){
                    union(subsets, i, j);
                }                
            }
        }
        int counter = 0;
        for(int i: subsets)
            if(i == -1)
                counter++;
        return counter;        
    }

    private int find(int[] subsets, int i){
        if(subsets[i] < 0) return i;
        subsets[i] = find(subsets, subsets[i]);
        return subsets[i];
    }

    private void union(int[] subsets, int i, int j){
        int parenti = find(subsets, i);
        subsets[parenti] = find(subsets, j);
        
    }

}
