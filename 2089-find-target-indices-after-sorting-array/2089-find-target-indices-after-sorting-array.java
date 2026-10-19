class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        int index = Arrays.binarySearch(nums, target);
        List<Integer> li = new ArrayList<>();
        
        // If target is not found, return the empty list immediately
        if (index < 0) {
            return li;
        }
        
        int left = index;
        int right = index;
        
        for (int i = left - 1; i >= 0; i--) {
            if (nums[i] == target) {
                left--;
            } else {
                break;
            }
        }
        
        for (int i = right + 1; i < nums.length; i++) {
            if (nums[i] == target) {
                right++;
            } else {
                break;
            }
        }
        
        for (int i = left; i <= right; i++) {
            li.add(i);
        }
        
        return li;
    }
}