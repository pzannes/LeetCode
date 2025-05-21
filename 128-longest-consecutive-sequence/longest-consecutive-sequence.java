class Solution {
    public int longestConsecutive(int[] nums) {
        
        // set to store numbers
        Set<Integer> next = new HashSet<>(); 
        // add each number to the set
        for (int n : nums) {
            next.add(n); 
        }
        // count to return to user
        int longCount = 0;
        // for each entry
        for (Integer entry : next) {
            int streak = 0, curr = entry; 
            // while the set contains the immediate neighbor of current number
            if (!next.contains(entry - 1)) {
                while(next.contains(curr)) {
                    streak++; // update the streak
                    curr++;  
                }
            }
            longCount = Math.max(longCount, streak); // res maintains longest streak

        }

        return longCount; // return. 

    }
}