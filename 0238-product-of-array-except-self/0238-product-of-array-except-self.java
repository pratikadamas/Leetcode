class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        
        int[] prefix=new int[n];
        int[] sufix= new int[n];

        int pre=1;    
        prefix[0]=1;
        for(int i=1;i<n;i++){
             pre*=nums[i-1];
            prefix[i]=pre;
            // pre*=prefix[i-1];
        }

        int suf=1;
        sufix[n-1]=1;

        for(int i=n-2;i>=0;i--){
            suf*=nums[i+1];
            sufix[i]=suf;
        }

        int ans[]= new int[n];
        for(int i=0;i<n;i++){
            ans[i]=sufix[i]*prefix[i];

        } 
        return ans;
    }
}