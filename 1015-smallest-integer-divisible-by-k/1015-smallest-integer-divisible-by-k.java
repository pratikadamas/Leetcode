class Solution {
    public int smallestRepunitDivByK(int k) {
        // If k is divisible by 2 or 5, it can never divide a number ending in 1
        if (k % 2 == 0 || k % 5 == 0) {
            return -1;
        }
        
        int remainder = 0;
        
        // By the Pigeonhole Principle, we only need to check up to length k
        for (int length = 1; length <= k; length++) {
            remainder = (remainder * 10 + 1) % k;
            
            if (remainder == 0) {
                return length;
            }
        }
        
        return -1;
    }
}