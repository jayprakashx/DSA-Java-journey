class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        
        // Store both the old and new value in the same cell
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] + n * (nums[nums[i]] % n);
        }
        
        // Extract the new value
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] / n;
        }
        
        return nums;
    }
}
