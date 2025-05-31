class Solution {
    public boolean isPalindrome(String s) {

                char[] array = s.toCharArray();
        int i = 0, j = (array.length - 1);  

        while ( i <= j ) {
            if (i == j) return true; 

            if (Character.isLetterOrDigit(array[i]) && Character.isLetterOrDigit(array[j])) {
                if (Character.toLowerCase(array[i]) != Character.toLowerCase(array[j])) {
                    return false; 
                }
                else { 
                    i++; 
                    j--; 
                }
            }

            if (!Character.isLetterOrDigit(array[i])) {
                i++;
            }

            if (!Character.isLetterOrDigit(array[j])) {
                j--; 
            }
        }
        
        return true; 
        
    }
}