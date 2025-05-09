class Solution {
    public boolean containsDuplicate(int[] nums) {
        // create set for easy logi
        HashSet<Integer> set = new HashSet<>(); 
        // make sure number isn't included twice 
        for (int num : nums) {
            if (!set.add(num)) { 
                return true; 
            }
        
        }
        return false; 
    }
}