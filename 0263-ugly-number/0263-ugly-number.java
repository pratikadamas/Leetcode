class Solution {
    public boolean isUgly(int n) {
        // Ugly numbers are strictly positive integers
        if (n <= 0) {
            return false;
        }
        
        // Allowed prime factors
        int[] factors = {2, 3, 5};
        
        // Repeatedly divide n by 2, 3, and 5
        for (int factor : factors) {
            while (n % factor == 0) {
                n /= factor;
            }
        }
        
        // If the remaining number is 1, it had no other prime factors
        return n == 1;
    }
}