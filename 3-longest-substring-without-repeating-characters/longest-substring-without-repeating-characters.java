class Solution {
    public int lengthOfLongestSubstring(String s) {

        int res = 0, l = 0; // my result and left pointer
        Set<Character> subString = new HashSet<>(); 

        for (int r = 0; r < s.length(); r++) { 
            
            while (subString.contains(s.charAt(r))) { // this updates the sliding window
                subString.remove(s.charAt(l)); 
                l++; 
            }
            
            // establish new start point or add unique character
            subString.add(s.charAt(r));
            // update largest window if necessary 
            res = Math.max(res, r - l + 1); 

        }

        return res; 
        
    }
}