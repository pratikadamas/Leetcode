class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];   // best sum found so far
        int currentSum = nums[0]; // sum of current subarray

        for (int i = 1; i < nums.length; i++) {
            // Either extend the current subarray OR start new with nums[i]
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            // Update the global maximum
            max = Math.max(max, currentSum);
        }

        return max;
    }
}
