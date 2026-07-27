class Solution {
    public int maxProduct(int[] nums) {
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;

        for(int e:nums){
            if(e>max1){
                max2=max1;
                max1=e;
                
            }
            else if(e>max2){
                max2=e;
            }
        }

     return (max1-1)*(max2-1);   
    }
}