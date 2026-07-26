class Solution {
    public int maximumProduct(int[] nums) {
        // Initialize the largest and smallest values
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;

        // Single pass to find the top 3 maximums and top 2 minimums
        for (int n : nums) {
            // Update minimums
            if (n <= min1) {
                min2 = min1;
                min1 = n;
            } else if (n <= min2) {
                min2 = n;
            }

            // Update maximums
            if (n >= max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (n >= max2) {
                max3 = max2;
                max2 = n;
            } else if (n >= max3) {
                max3 = n;
            }
        }

        // The maximum product will be either:
        // 1. Product of the 3 largest elements
        // 2. Product of the 2 smallest (most negative) elements * the largest element
        return Math.max(min1 * min2 * max1, max1 * max2 * max3);
    }
}