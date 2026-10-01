class Solution {
    public boolean isValid(String s) {

  Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } 
            else {
                // if no opening bracket available
                if (st.isEmpty()) return false;

                char top = st.pop();

                // check matching pairs
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // stack must be empty
        return st.isEmpty();
    }
    
}