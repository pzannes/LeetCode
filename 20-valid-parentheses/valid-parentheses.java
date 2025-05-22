class Solution {
    public boolean isValid(String s) {

        // create string with opening and closing characters
        final String open = "([{"; 
        final String close = ")]}"; 

        // Stack to track 
        Stack<Character> stack = new Stack<>(); 

        // iterate through string
        for (Character c : s.toCharArray()) {

            if (open.indexOf(c) != -1) { // valid open
                stack.push(c); 
            }
            else if (close.indexOf(c) != -1) { // valid close
                
                if (stack.isEmpty()) {
                    return false; 
                }
                // pop operation ensures valid stack
                if (close.indexOf(c) != open.indexOf(stack.pop())) {
                    return false; 
                }
            }
        }
        
        if (!stack.isEmpty()) {
            return false; 
        } 
        
        return true;
        
    }
}