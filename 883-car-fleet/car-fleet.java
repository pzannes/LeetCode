class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

        // we create a 2-D array for each car with their position and speed
        int [][] pair = new int[position.length][2]; 
        for (int i = 0; i < position.length; i++) {
            pair[i][0] = position[i]; 
            pair[i][1] = speed[i]; 
        }

        // then we sort the array in decreasing order based on the position of the car
        Arrays.sort(pair, (a, b) -> Integer.compare(b[0], a[0])); 

        // calculate the number of steps to get to the target
        Stack<Double> stack = new Stack<>(); 
        for (int[] p : pair) {
            // add value to the stack
            stack.push((double) (target - p[0]) / (p[1])); 

            // compare current car with the one starting ahead of it
            if (stack.size() > 1 && stack.peek() <= stack.get(stack.size() - 2)) {
                // get stack.size() - 2 gets the second to last element in the stack
                stack.pop(); 
            }
        }
        
        return stack.size();
        
    }
}