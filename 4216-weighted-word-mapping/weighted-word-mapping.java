class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder result = new StringBuilder();
        
        for (String word : words) {
            int currentWeight = 0;
            
            // Calculate the total weight of the current word
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                currentWeight += weights[c - 'a'];
            }
            
            // Apply modulo 26
            int remainder = currentWeight % 26;
            
            // Map to reverse alphabetical order (0 -> 'z', 1 -> 'y', etc.)
            char mappedChar = (char) ('z' - remainder);
            
            // Append to the result
            result.append(mappedChar);
        }
        
        return result.toString();
    }
}