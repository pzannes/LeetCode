class Solution {
    public int maxProfit(int[] prices) {

        int min = Integer.MAX_VALUE, maxProf = 0; // min to keep track

        for (int price : prices) {
            
            if (price < min) { // can't make profit w/ min value
                min = price; 
                continue; 
            }

            int profit = price - min; 
            maxProf = Math.max(maxProf, profit); // keep max prof
        }

        return maxProf; 
        
    }
}