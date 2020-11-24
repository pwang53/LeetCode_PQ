class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        
        if (s == null || s.length() < p.length()) return list;
        
        int[] hash = new int[256];
        
        for (char c : p.toCharArray()) {
            hash[c] ++;
        }
        
        int left = 0, count = 0;
        for (int right = 0; right < s.length(); right++) {
            hash[s.charAt(right)] --;
            
            if (hash[s.charAt(right)] >= 0) {
                count++;
            }
            
            if (right > p.length() - 1) {
                hash[s.charAt(left)] ++;
                
                if (hash[s.charAt(left)] > 0) {
                    count --;
                }
                
                left++;
            }
            
            if (count == p.length()) {
                list.add(left);
            }
        }
        
        return list;
    }
}
