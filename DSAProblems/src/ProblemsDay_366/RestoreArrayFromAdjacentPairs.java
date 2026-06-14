package ProblemsDay_366;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RestoreArrayFromAdjacentPairs {

//https://leetcode.com/problems/restore-the-array-from-adjacent-pairs/?envType=problem-list-v2&envId=array
    public int[] restoreArray(int[][] adjacentPairs) {
        HashMap<Integer, List<Integer>> adj = new HashMap<>();

        for( int[] pair : adjacentPairs ) {
            int u = pair[0];
            int v = pair[1];

            adj.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
            adj.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
        }

        int n = adj.size();
        int[] res = new int[n];

        int root = 0;
        for( int key : adj.keySet() ) {
            if( adj.get(key).size() == 1 ) {
                root = key;
                break;
            }
        }

        dfs( root, Integer.MAX_VALUE, res, adj, 0 );

        return res;
    }

    private void dfs(int node, int prev, int[] res, HashMap<Integer, List<Integer>> adj, int idx) {
        res[idx] = node;

        for( int neighbor : adj.get(node) ) {
            if( neighbor != prev ) {
                dfs( neighbor, node, res, adj, idx + 1 );
            }
        }
    }

    public static void main(String[] args) {

    }
}
