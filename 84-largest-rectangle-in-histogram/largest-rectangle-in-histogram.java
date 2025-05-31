class Solution {
    public int largestRectangleArea(int[] heights) {
         // add the first item to the stack and keep track of it's start index

        // is the next item >= prev? 
            // if yes -> update index of prev item
                // add curr item to stack

            // if no -> calc area for prev rec
                // update index of curr to be start of prev

        int maxArea = 0; 

        Stack<int[]> stack = new Stack<>(); 

        for (int i = 0; i < heights.length; i++) {

            int start = i; 

            while (!stack.isEmpty() && stack.peek()[1] > heights[i] ) {
                int[] top = stack.pop(); 
                int index = top[0]; 
                int height = top[1]; 

                maxArea = Math.max(maxArea, height * (i - index)); 

                start = index; 
            }

            stack.push(new int[]{start, heights[i]}); 
        }

        for (int[] pair : stack) {
            int index = pair[0]; 
            int height = pair[1]; 
            maxArea = Math.max(maxArea, height * (heights.length - index)); 
        }

        return maxArea; 
    }
}