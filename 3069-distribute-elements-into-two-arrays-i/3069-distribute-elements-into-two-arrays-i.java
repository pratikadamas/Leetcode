class Solution
{
    public int[] resultArray(int[] nums)
    {
         ArrayList<Integer> l1 = new ArrayList<>();
         ArrayList<Integer> l2 = new ArrayList<>();
         l1.add(nums[0]);
         l2.add(nums[1]);

        for(int i=2;i<nums.length;i++)
        {
            if(l1.get(l1.size()-1)>l2.get(l2.size()-1))
            {
                l1.add(nums[i]);
            }
            else
            {
                l2.add(nums[i]);
            }
            
        }

        int[] ans = new int[l1.size()+l2.size()];

        for(int i=0;i<l1.size();i++)
        {
            ans[i]=l1.get(i);
        }
        int j=0;
        for(int i=l1.size();i<ans.length;i++)
        {
            ans[i]=l2.get(j++);
        }

        return ans;

    }
}