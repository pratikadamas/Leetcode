class Solution {
    public int findGCD(int[] nums)
     {
            Arrays.sort(nums);
            int min=nums[0];
            int max=nums[nums.length-1];

            return gcd(min,max);
    }

    public static   int gcd(int min, int max )
    {
        if(max==0)
            return min;

         return gcd(max,min%max);   
    } 
}