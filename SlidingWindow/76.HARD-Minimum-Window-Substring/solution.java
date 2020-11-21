class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) return "";
        
        int[] hash = new int[256];
        
        for (char c : t.toCharArray()) {
            hash[c] ++;
        }
        
        int left = 0;
        int minLength = s.length();
        int count = 0;
        String ans = "";
        // A D O B E C O D E B A N C
        // l          r
        
        // a b b a b    ab
        // l   r
        for (int right = 0; right < s.length(); right++) {
            hash[s.charAt(right)] --;
            
            if (hash[s.charAt(right)] >= 0) count ++;
            
            while (hash[s.charAt(left)] < 0 && left < right) {
                hash[s.charAt(left)] ++;
                if (hash[s.charAt(left)] > 0) count --;
                left ++;
            }
            
            if (count == t.length() && minLength >= right - left + 1) {
                minLength = right - left + 1;
                ans = s.substring(left, right + 1);
            }
            
        }
        
        return ans;
    }

}
