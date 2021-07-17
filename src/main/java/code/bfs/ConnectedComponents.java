package code.bfs;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/number-of-connected-components-in-an-undirected-graph/
 */
public class ConnectedComponents {
    public int countComponents(int n, int[][] edges) {
        int count = 0;
        int[] visited = new int[n];
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge: edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        for (int i = 0; i < n; i++) {
            if (visited[i] == 0) {
                count++;
                dfs(graph, i, visited);
            }
        }

        return count;
    }

    void dfs(List<List<Integer>> graph, int i, int[] visited) {
        if (visited[i] != 0) {
            return;
        }

        visited[i] = 1;

        for (int node : graph.get(i)) {
            dfs(graph, node, visited);
        }
    }

}
