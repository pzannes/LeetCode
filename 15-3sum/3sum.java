class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums); // in sorted order O(nlogn)

        List<List<Integer>> threeSum = new ArrayList<>(); 

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) break; // because adding all positive integers is never zero

            if (i > 0 && nums[i] == nums[i-1]) continue; // don't want the same start value

            int l = i + 1, r = nums.length - 1; // our two pointers

            while (l < r) {

                int sum = nums[i] + nums[l] + nums[r]; 
                if (sum < 0) {
                    l++; 
                } else if (sum > 0) {
                    r--; 
                } else {
                    threeSum.add(Arrays.asList(nums[i], nums[l], nums[r])); 
                    l++; 
                    r--;
                    while (l<r && nums[l] == nums[l-1]) { // make sure there are no dups
                        l++; 
                    }
                }
            }
        }
        return threeSum; 
        
    }
}