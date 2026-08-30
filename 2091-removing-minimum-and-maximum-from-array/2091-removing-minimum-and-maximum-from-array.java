class Solution {
    public int minimumDeletions(int[] nums) {

        int n = nums.length;

        if (n == 1)
            return 1;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int minIndex = -1;
        int maxIndex = -1;

        for (int i = 0; i < n; i++) {

            if (nums[i] < min) {
                min = nums[i];
                minIndex = i;
            }

            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }

        int left = Math.min(minIndex, maxIndex);
        int right = Math.max(minIndex, maxIndex);

        // Remove both from left
        int leftOnly = right + 1;

        // Remove both from right
        int rightOnly = n - left;

        // Remove one from left and one from right
        int bothSides = (left + 1) + (n - right);

        return Math.min(leftOnly,
                Math.min(rightOnly, bothSides));
    }
}