class Solution {
    private void backtrack(int openN, int closeN, int n, List<String> result, StringBuilder stack) {

        // base case when there is an close paren for every open paren
        // and we've reached our limit of allowable open parens 
        if (openN == closeN && openN == n) {
            result.add(stack.toString()); 
            return; 
        }

        // if we can still add open parens
        if (openN < n) {
            // always start with open paren
            stack.append('(');
            // recursive call with update open paren and stack 
            backtrack(openN + 1, closeN, n, result, stack); 
            // return and delete the char just added to build on preexisting stack
            stack.deleteCharAt(stack.length() - 1); 
        }

        if (closeN < openN) {
            // add close paren until == openN 
            stack.append(')');
            // call with updated stack  
            backtrack(openN, closeN + 1, n, result, stack); 
            // delete to build new 
            stack.deleteCharAt(stack.length() - 1); 
        }
    }
    
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>(); 
        StringBuilder stack = new StringBuilder(); 
        // call recursively to build proper parens
        backtrack(0, 0, n, result, stack); 

        return result; 
    }
}