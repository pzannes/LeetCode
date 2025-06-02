class Solution {
    public int characterReplacement(String s, int k) {

        int res = 0; 
        Set<Character> cSet = new HashSet<>(); 

        for (Character c : s.toCharArray()) { // get each character
            cSet.add(c); 
        }

        for (char c : cSet) { // for each character in the set
            int count = 0, l = 0; 

            for (int r = 0; r < s.length(); r++) { // iterate through the string cSet.size() times 
                if (s.charAt(r) == c) { // if the character at r == current character 
                    count++; // increase the count 
                }
                while ((r-l+1) - count > k) { // we can replace up to k characters
                    if (s.charAt(l) == c) { // if the character we delete is the current character
                        count--; 
                    }
                    l++; // otherwise, move the pointer left 
                }

                res = Math.max(res, r - l + 1); // running max 
            }
        }

        return res; 
        
    }
}