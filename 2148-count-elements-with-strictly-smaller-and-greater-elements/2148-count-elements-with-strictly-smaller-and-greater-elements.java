class Solution 
{
    public int countElements(int[] nums) 
    {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // 1. Find the min and max
        for(int e : nums)
        {
            if(e > max)
            {
                max = e;
            }
            // Removed 'else' so both min and max can be evaluated independently
            if(e < min)
            {
                min = e;
            }
        }

        int count = 0;

        // 2. Count elements strictly between min and max
        for(int e : nums)
        {
            if(e > min && e < max)
            {
                count++;
            }
        }

        // 3. Return the count directly
        return count;
    }
}