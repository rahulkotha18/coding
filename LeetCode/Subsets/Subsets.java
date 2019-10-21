class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        ArrayList<Integer> temp = new ArrayList<>();

        backtrack(ans, temp, 0, nums);
        return ans;
    }

    private void backtrack(List<List<Integer>> ans, ArrayList<Integer> temp, int start, int[] nums){
        ans.add(new ArrayList<>(temp));

        for(int i = start; i < nums.length; i++){
            temp.add(nums[i]);
            backtrack(ans, temp, i+1, nums);
            temp.remove(temp.size()-1);
        }
    }
}