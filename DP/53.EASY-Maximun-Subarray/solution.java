class Solution {
    public int maxSubArray(int[] nums) {
        // [-2, 1, -3, 4, -1, 2, 1, -5, 4]
        //  1. 前面所有和
        //  2. 前面所有和 + 本身
        
        int maxSum = nums[0];
        int maxCurrent = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            maxCurrent = Math.max(maxCurrent + nums[i], nums[i]);
            
            maxSum = Math.max(maxCurrent, maxSum);
        }
        
        return maxSum;
    }
}
