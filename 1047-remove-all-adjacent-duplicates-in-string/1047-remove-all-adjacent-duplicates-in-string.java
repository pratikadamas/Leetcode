import java.util.Stack;

class Solution {
    public String removeDuplicates(String s) {
        // Handle edge case for empty strings
        if (s == null || s.length() == 0) {
            return s;
        }

        Stack<Character> st = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            // If the stack has elements and the top matches the current char, remove it
            if (!st.isEmpty() && st.peek() == ch) {
                st.pop();
            } else { 
                // Otherwise, push the current character onto the stack
                st.push(ch);
            }
        }
        
        // Rebuild the string from the stack
        StringBuilder s1 = new StringBuilder();
        while (!st.isEmpty()) {
            s1.append(st.pop());
        }
        
        return s1.reverse().toString();
    }
}
