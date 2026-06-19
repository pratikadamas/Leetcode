class Solution {

    public int findCircleNum(int[][] isConnected) {

        int n = isConnected.length;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i != j && isConnected[i][j] == 1) {
                    adj.get(i + 1).add(j + 1);
                }
            }
        }

        int count = 0;
        int[] visited = new int[n + 1];

        for(int i = 1; i <= n; i++) {
            if(visited[i] == 0) {
                dfs(i, adj, visited);
                count++;
            }
        }

        return count;
    }

    public static void dfs(int start,
                           ArrayList<ArrayList<Integer>> adj,
                           int[] visited) {

        visited[start] = 1;

        for(int ngr : adj.get(start)) {
            if(visited[ngr] == 0) {
                dfs(ngr, adj, visited);
            }
        }
    }
}