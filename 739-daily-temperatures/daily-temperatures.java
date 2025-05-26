class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        Stack<int[]> stack = new Stack<>(); // pair: [temp, index]

        int [] result = new int[temperatures.length];  

        for (int i = 0; i < temperatures.length; i++) {
            
            int t = temperatures[i]; 
            
            while (!stack.isEmpty() && stack.peek()[0] < t) {
                int[] pair = stack.pop(); 
                result[pair[1]] = i - pair[1]; 
            }

            stack.push(new int[]{t, i}); 

        }

        return result; 
        
    }
}