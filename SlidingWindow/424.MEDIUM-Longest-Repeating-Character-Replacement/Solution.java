class Solution {
    public int characterReplacement(String s, int k) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        int[] hash = new int[256];
        
        int ans = 0;
        int left = 0;
        int largestCharCount = 0;
        
        for (int right = 0; right < s.length(); right ++) {
            hash[s.charAt(right)] ++;
            
            if (largestCharCount < hash[s.charAt(right)]) {
                largestCharCount = hash[s.charAt(right)];
            }
            
            while (right - left + 1 - largestCharCount > k) {
                hash[s.charAt(left)] --;
                left ++;
            }
            
            ans = Math.max(ans, right - left + 1);
        }
        
        return ans;
    }
}
