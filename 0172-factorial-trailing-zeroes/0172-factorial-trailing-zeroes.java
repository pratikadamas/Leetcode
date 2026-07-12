class Solution {
    public int trailingZeroes(int n) {
        int count =0;

        while(n>0)
        {
            n= (int)Math.floor(n/5);
            count +=n;
        }
        
        return count;
    }
}