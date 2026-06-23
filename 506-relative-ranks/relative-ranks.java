

class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] res = new String[n];
        
        // Create a 2D array where each element is [original_score, original_index]
        int[][] pairs = new int[n][2];
        for (int i = 0; i < n; i++) {
            pairs[i][0] = score[i];
            pairs[i][1] = i;
        }
        
        // Sort the pairs by score in descending order
        Arrays.sort(pairs, (a, b) -> Integer.compare(b[0], a[0]));
        
        // Assign ranks based on sorted positions
        for (int i = 0; i < n; i++) {
            int originalIndex = pairs[i][1];
            
            if (i == 0) {
                res[originalIndex] = "Gold Medal";
            } else if (i == 1) {
                res[originalIndex] = "Silver Medal";
            } else if (i == 2) {
                res[originalIndex] = "Bronze Medal";
            } else {
                res[originalIndex] = (i+1)+"";
            }
        }
        
        return res;
    }
}
