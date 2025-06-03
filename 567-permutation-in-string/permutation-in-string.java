class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false; 
        }

        // initialize two arrays
        int[] s1Chars = new int[26], s2Chars = new int[26]; 

        // set up s1 array for comparison
        for (char c : s1.toCharArray()) {
            s1Chars[(int) c-'a']++; 
        } 

        // sliding window
        int l = 0; 
        for (int r = 0; r < s2.length(); r++) {
            
            // add the new character 
            s2Chars[(int) s2.charAt(r) - 'a']++; 

            // make sure this is a valid permutation of s1 by making sure the size matches
            while(r-l+1 > s1.length()) {
                s2Chars[(int) s2.charAt(l) - 'a']--; 
                l++; 
            }

            // need the Arrays.equals method because standard comparison will check 
            // whether the location of the arrays are the same in memory, which is 
            // always false. Arrays.equals will check the contents of the arrays. 
            if (Arrays.equals(s1Chars, s2Chars)) {
                return true; 
            }
        }

        return false;   
    }
}
