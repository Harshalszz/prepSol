package ProblemsDay_345;

import java.util.ArrayList;
import java.util.List;

public class LongestPathWithDifferentAdjacentCharacters {
//https://leetcode.com/problems/longest-path-with-different-adjacent-characters/?utm_source=chatgpt.com
    private String STR;
    private int result;

    public int longestPath(int[] parent, String s) {
        int[] diameter = new int[0];
        List<List<Integer>> graph = buildGraph(parent);
        this.STR = s;
        this.result = 0;

        recursion(0, -1, graph);
        return this.result;
    }

    private int recursion(int node, int prev, List<List<Integer>> graph) {
        // initialize as EXCLUDING node itself
        int maxDown = 0;
        int secMaxDown = 0;

        for (int nei: graph.get(node)) {
            if (nei == prev) continue;
            int maxDownChild = recursion(nei, node, graph);

            // if [node -> child] is INVALID: skip
            if (this.STR.charAt(node) == this.STR.charAt(nei)) continue;

            // else:
            if (maxDownChild > maxDown) {
                secMaxDown = maxDown;
                maxDown = maxDownChild;
            } else if (maxDownChild > secMaxDown)
                secMaxDown = maxDownChild;

            this.result = Math.max(this.result, maxDown + secMaxDown + 1);
        }

        // handle corner case: NO neighbors
        this.result = Math.max(this.result, maxDown + 1);

        return maxDown + 1; // INCLUDING node itself
    }

    private List<List<Integer>> buildGraph(int[] parent) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < parent.length; i++)
            graph.add(new ArrayList<>());

        for (int i = 1; i < parent.length; i++) {
            graph.get(parent[i]).add(i);
        }

        return graph;
    }

    public static void main(String[] args) {

    }
}
