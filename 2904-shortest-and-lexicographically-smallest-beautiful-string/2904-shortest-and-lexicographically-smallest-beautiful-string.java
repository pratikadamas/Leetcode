class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int left = 0;
        int ones = 0;

        int bestLen = Integer.MAX_VALUE;
        String ans = "";

        for (int right = 0; right < s.length(); right++) {

            if (s.charAt(right) == '1') {
                ones++;
            }

            // Too many 1s -> move left
            while (ones > k) {
                if (s.charAt(left) == '1') {
                    ones--;
                }
                left++;
            }

            // Exactly k ones
            if (ones == k) {

                // Remove leading zeros.
                // This makes the window as short as possible.
                while (s.charAt(left) == '0') {
                    left++;
                }

                int len = right - left + 1;
                String candidate = s.substring(left, right + 1);

                if (len < bestLen) {
                    bestLen = len;
                    ans = candidate;
                } else if (len == bestLen && candidate.compareTo(ans) < 0) {
                    ans = candidate;
                }
            }
        }

        return ans;
    }
}