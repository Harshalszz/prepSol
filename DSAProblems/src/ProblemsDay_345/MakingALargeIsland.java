package ProblemsDay_345;

import java.util.HashMap;
import java.util.HashSet;

public class MakingALargeIsland {
//https://leetcode.com/problems/making-a-large-island/?utm_source=chatgpt.com

    public int dfs(int[][] grid, boolean[][] vis, char[][] island,int r, int c, int R, int C, char ch) {
        vis[r][c] = true;
        island[r][c] = ch;
        int area = 1;
        int[] diff = {0, -1, 0, 1, 0};
        for (int i = 0; i < 4; i++) {
            int ar = r + diff[i], ac = c + diff[i + 1];
            if (ar >= 0 && ar < R && ac >= 0 && ac < C &&
                    !vis[ar][ac] && grid[ar][ac] == 1) {
                area += dfs(grid, vis, island, ar, ac, R, C, ch);
            }
        }

        return area;
    }

    public int checkislands(int[][] grid, boolean[][] vis, char[][] island,int r, int c, int R, int C,HashMap<Character, Integer> map) {
        int[] diff = {0, -1, 0, 1, 0};
        int max = 1;
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < 4; i++) {
            int ar = r + diff[i], ac = c + diff[i + 1];
            if (ar >= 0 && ar < R && ac >= 0 && ac < C && vis[ar][ac]) {
                char id = island[ar][ac];
                if (!set.contains(id)) {
                    max += map.get(id);
                    set.add(id);
                }
            }
        }
        return max;
    }
    public int largestIsland(int[][] grid) {
        int R = grid.length, C = grid[0].length;
        boolean[][] vis = new boolean[R][C];
        char[][] island = new char[R][C];
        int res = 0;
        char ch = '1';
        HashMap<Character, Integer> map = new HashMap<>();
        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                if (grid[r][c] == 1 && !vis[r][c]) {
                    int area = dfs(grid, vis, island, r, c, R, C, ch);
                    res = Math.max(res, area);
                    map.put(ch, area);
                    ch++;
                }
            }
        }
        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                if (grid[r][c] == 0) {
                    res = Math.max(res,checkislands(grid, vis, island, r, c, R, C, map));
                }
            }
        }

        return res;
    }
    public static void main(String[] args) {

    }
}
