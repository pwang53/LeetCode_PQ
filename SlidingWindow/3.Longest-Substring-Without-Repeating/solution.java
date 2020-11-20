class Solution {
    public int lengthOfLongestSubstring(String s) {
        // a b c a b c b b
        //   l   r
        
        
        if (s == null || s.length() == 0) return 0;
        
        int[] hash = new int[256];
        
        int length = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            hash[s.charAt(right)] ++;
            
            while (hash[s.charAt(right)] > 1) {
                hash[s.charAt(left)] --;
                left ++;
            }
            
            length = Math.max(length, right - left + 1);
        }
        
        return length;
    }
}
