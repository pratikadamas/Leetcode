class Solution {
    private Integer[][] memo; 
    private int netScore(int[] nums, int st, int en) {
        if(st > en) return 0; 
        // pick left 
        if(memo[st][en] != null) return memo[st][en]; 
        int left = nums[st] - netScore(nums, st + 1, en); 
        // pick right 
        int right = nums[en] -netScore(nums, st, en -1); 
        return memo[st][en] = Math.max(left, right); 
    }
    public boolean predictTheWinner(int[] nums) {
        int n = nums.length; 
        memo = new Integer[n][n]; 
        // solve it via net score 
        return netScore(nums, 0, n - 1) >= 0; 
    }
}