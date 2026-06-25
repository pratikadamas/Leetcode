class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        
        int  n=nums.length;

        int count=0;

        for(int i=0;i<n;i++){
                int cnt=0;
                for(int j=i;j<n;j++){
                    if(nums[j]==target) cnt++;
                        int curr_length=(j-i+1)/2;
                    if(cnt>curr_length) count ++;
                }

        }
        return count;
    }
}