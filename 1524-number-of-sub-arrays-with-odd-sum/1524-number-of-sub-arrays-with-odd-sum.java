class Solution {
    /**
     * Approach 1: Running Sum
     */
    public int numOfSubarrays(int[] arr) {
        int even = 1, odd = 0;
        int ans = 0;
        int M = 1000000007;

        int cs = 0;

        for (int i = 0; i < arr.length; i++) {
            cs += arr[i];

            // If current prefix sum is odd, pair it with previous even prefix sums.
            if (cs % 2 == 1) {
                ans += even;
            } else {
                // If current prefix sum is even, pair it with previous odd prefix sums.
                ans += odd;
            }

            // Update the frequency of the current prefix sum's parity.
            if (cs % 2 == 1) {
                odd++;
            } else {
                even++;
            }

            // Keep the answer within the modulo limit.
            ans %= M;
        }

        return ans;
    }
}