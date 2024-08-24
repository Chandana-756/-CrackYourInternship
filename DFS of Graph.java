class Solution {
    // Function to perform DFS traversal from a given node
    private void dfs(int node, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ans, boolean[] visited) {
        // Mark the current node as visited
        visited[node] = true;
        // Add the current node to the answer list
        ans.add(node);

        // Recur for all the vertices adjacent to this vertex
        for (Integer neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, adj, ans, visited);
            }
        }
    }

    // Function to return a list containing the DFS traversal of the graph
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] visited = new boolean[V];
        
        // Start DFS from node 0
        dfs(0, adj, ans, visited);
        
        return ans;
    }
}

Time Complexity: O(V+E)
Space Complexity: O(V)
