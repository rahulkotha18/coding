class Solution {
	private boolean isSorted;
    
    public void sortColors(int[] nums) {
        if (nums.length <= 1) {
			System.out.println(Arrays.toString(nums));
		}
		
		isSorted = false;
		
		while(!isSorted) {
			nums = sortList(nums);
		}
    }
    
    private int[] sortList(int[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			if (list[i] > list[i + 1]) {
				int temp = list[i + 1];
				list[i + 1] = list[i];
				list[i] = temp;
				return list;
			}
		}
		
		isSorted = true;
		
		return list;
	}
}
