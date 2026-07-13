class Solution {
    public int[] sortArray(int[] nums) {
        int n=nums.length;
         Arrays.sort(nums);
         int temp[] =new int[n];
         for(int i=0;i<n;i++){
            temp[i]=nums[i];
         }

         return temp;
    }
}