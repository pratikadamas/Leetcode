

class Solution {
    private static final int MOD = 1_000_000_007;
    private int LOG;
    private int[][] up;
    private int[] depth;
    private List<Integer>[] graph;
    private long[] pow2;

    public int[] assignEdgeWeights(int[][] edges, int[][] queries) {
        int n = edges.length + 1;

        graph = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] e : edges) {
            int u = e[0], v = e[1];
            graph[u].add(v);
            graph[v].add(u);
        }

        LOG = 1;
        while ((1 << LOG) <= n) LOG++;

        up = new int[LOG][n + 1];
        depth = new int[n + 1];

        dfs(1, 0);

        for (int k = 1; k < LOG; k++) {
            for (int v = 1; v <= n; v++) {
                up[k][v] = up[k - 1][up[k - 1][v]];
            }
        }

        pow2 = new long[n + 1];
        pow2[0] = 1;
        for (int i = 1; i <= n; i++) {
            pow2[i] = (pow2[i - 1] * 2) % MOD;
        }

        int m = queries.length;
        int[] ans = new int[m];

        for (int i = 0; i < m; i++) {
            int u = queries[i][0];
            int v = queries[i][1];

            int lca = lca(u, v);
            int dist = depth[u] + depth[v] - 2 * depth[lca];

            ans[i] = (dist == 0) ? 0 : (int) pow2[dist - 1];
        }

        return ans;
    }

    private void dfs(int node, int parent) {
        up[0][node] = parent;

        for (int nxt : graph[node]) {
            if (nxt == parent) continue;
            depth[nxt] = depth[node] + 1;
            dfs(nxt, node);
        }
    }

    private int lca(int a, int b) {
        if (depth[a] < depth[b]) {
            int tmp = a;
            a = b;
            b = tmp;
        }

        int diff = depth[a] - depth[b];

        for (int k = 0; k < LOG; k++) {
            if (((diff >> k) & 1) == 1) {
                a = up[k][a];
            }
        }

        if (a == b) return a;

        for (int k = LOG - 1; k >= 0; k--) {
            if (up[k][a] != up[k][b]) {
                a = up[k][a];
                b = up[k][b];
            }
        }

        return up[0][a];
    }
}