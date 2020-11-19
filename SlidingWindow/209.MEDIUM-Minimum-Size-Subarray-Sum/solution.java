class Solution {
    // 2 3 1 2 4 3
    // 2 3 [1 2 4] 3  => sum = 8 > 7 => record length => move l pointer => ....
    //  l      r  => r - l + 1 = > length
    
    // []
    public int minSubArrayLen(int s, int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;    
        }
        
        int minRes = Integer.MAX_VALUE;
        
        int left = 0;
        int currentSum = 0;
        // 2 3 1 2 4 3
        // l         r
        for (int right = 0; right < nums.length; right ++) {
            // [2 3 1]
            currentSum = currentSum + nums[right];
            
            // 
            while (currentSum >= s) {
                // r - l + 1 : minRes => minRes
                minRes = Math.min(right - left + 1, minRes);
                // 2 [3 1] 2 4 3
                //   l 
                currentSum -= nums[left];
                left ++;
            }
        }
        
        // [2 1] target = 7
        return minRes == Integer.MAX_VALUE ? 0 : minRes;
    }
}
