class Solution {
    public int minAddToMakeValid(String s) {
        int openCount = 0;
        int addCount = 0;
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                // We have an unmatched opening parenthesis
                openCount++;
            } else {
                // We have a closing parenthesis
                if (openCount > 0) {
                    // Match it with an available opening parenthesis
                    openCount--;
                } else {
                    // No available opening parenthesis, we must add one
                    addCount++;
                }
            }
        }
        
        // Total additions is the number of added '(' plus the remaining unmatched '('
        return addCount + openCount;
    }
}