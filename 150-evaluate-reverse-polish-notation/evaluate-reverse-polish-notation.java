class Solution {
    public int evalRPN(String[] tokens) {

        // stack for keeping track of result
        Stack <Integer> stack = new Stack<>(); 

        for (String t : tokens) {
            // define vars
            Integer sec = 0; 
            Integer fir = 0;
            
            // assumes string is formatted properly
            switch (t) {  
                case "+":
                    // pop two
                    sec = stack.pop(); 
                    fir = stack.pop();
 
                    // push onto stack
                    stack.push(fir + sec);
                    break;  
                case "-": 
                    // sub and push
                    // pop two
                    sec = stack.pop(); 
                    fir = stack.pop();

                    // push onto stack
                    stack.push(fir - sec);
                    break; 
                case "/": 
                    // div and push
                    // pop two
                    sec = stack.pop(); 
                    fir = stack.pop();

                    // push onto stack
                    stack.push(fir / sec);
                    break;
                case "*": 
                    // mul and push
                    // div and push
                    // pop two
                    sec = stack.pop(); 
                    fir = stack.pop();

                    // push onto stack
                    stack.push(fir * sec);
                    break;
                default: 
                    stack.push(Integer.valueOf(t)); 
            }
        }

        return stack.pop(); // return final value
        
    }
}