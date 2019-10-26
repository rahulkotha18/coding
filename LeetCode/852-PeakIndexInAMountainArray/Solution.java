class Solution {
    public int peakIndexInMountainArray(int[] A) {
        return search(A, 0, A.length - 1);
    }
    private int search(int[] nums, int l, int r){
        if(l == r) return l;
        int mid = (l + r) / 2;
        if(nums[mid] > nums[mid + 1])
            return search(nums, l, mid);
        return search(nums, mid + 1, r);
    }
}

