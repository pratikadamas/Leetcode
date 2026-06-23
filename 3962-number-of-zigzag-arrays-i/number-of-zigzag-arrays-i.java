class Solution {
    private static final int MOD = 1_000_000_007;

    public int zigZagArrays(int n, int l, int r) {
        int m = r - l + 1;

        // n = 1
        if (n == 1) {
            return m;
        }

        long[] up = new long[m];
        long[] down = new long[m];

        // Initialize for length = 2
        for (int a = 0; a < m; a++) {
            for (int b = 0; b < m; b++) {
                if (a < b) {
                    up[b]++;
                } else if (a > b) {
                    down[b]++;
                }
            }
        }

        if (n == 2) {
            long ans = 0;
            for (int i = 0; i < m; i++) {
                ans = (ans + up[i] + down[i]) % MOD;
            }
            return (int) ans;
        }

        for (int len = 3; len <= n; len++) {

            long[] prefUp = new long[m + 1];
            long[] prefDown = new long[m + 1];

            for (int i = 0; i < m; i++) {
                prefUp[i + 1] = (prefUp[i] + up[i]) % MOD;
                prefDown[i + 1] = (prefDown[i] + down[i]) % MOD;
            }

            long[] newUp = new long[m];
            long[] newDown = new long[m];

            for (int x = 0; x < m; x++) {

                // Previous comparison was DOWN
                // Need current comparison UP
                newUp[x] = prefDown[x];

                // Previous comparison was UP
                // Need current comparison DOWN
                newDown[x] = (prefUp[m] - prefUp[x + 1] + MOD) % MOD;
            }

            up = newUp;
            down = newDown;
        }

        long ans = 0;
        for (int i = 0; i < m; i++) {
            ans = (ans + up[i] + down[i]) % MOD;
        }

        return (int) ans;
    }
}