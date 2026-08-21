class Solution {

    public long findKthSmallest(int[] coins, int k) {
        // Find minimum coin to establish a tight upper bound
        int minCoin = coins[0];
        for (int coin : coins) {
            minCoin = Math.min(minCoin, coin);
        }

        long low = 1;
        long high = (long) minCoin * k;

        // Binary search on the answer
        while (low < high) {
            long mid = low + (high - low) / 2;

            if (countValidAmounts(coins, mid) >= k) {
                // kth amount is <= mid
                high = mid;
            } else {
                // kth amount is > mid
                low = mid + 1;
            }
        }

        return low;
    }

    // Count how many distinct valid amounts are <= x using Inclusion-Exclusion
    private long countValidAmounts(int[] coins, long x) {
        int n = coins.length;
        long count = 0;

        // Iterate through all 2^n - 1 non-empty subsets
        for (int mask = 1; mask < (1 << n); mask++) {
            long lcm = 1;
            int bits = 0;
            boolean overflow = false;

            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    bits++;

                    long g = gcd(lcm, coins[i]);
                    long value = lcm / g;

                    // Prevent overflow: check if value * coins[i] > x
                    if (value > x / coins[i]) {
                        overflow = true;
                        break;
                    }

                    lcm = value * coins[i];
                }
            }

            if (overflow) {
                continue;
            }

            long multiples = x / lcm;

            // Odd-sized subsets add, even-sized subsets subtract
            if (bits % 2 == 1) {
                count += multiples;
            } else {
                count -= multiples;
            }
        }

        return count;
    }

    private long gcd(long a, long b) {
        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}