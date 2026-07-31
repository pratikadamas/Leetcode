class Solution {
    public int removeDuplicates(int[] nums) {
        // Arrays with 2 or fewer elements are valid by default
        if (nums.length <= 2) {
            return nums.length;
        }
        
        int k = 2; // Position to write the next valid element
        
        for (int i = 2; i < nums.length; i++) {
            // Check against the element two positions back in the valid portion
            if (nums[i] != nums[k - 2]) {
                nums[k] = nums[i];
                k++;
            }
        }
        
        return k;
    }
}