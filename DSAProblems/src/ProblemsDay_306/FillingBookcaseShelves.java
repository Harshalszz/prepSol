package ProblemsDay_306;

import java.util.Arrays;

public class FillingBookcaseShelves {
//https://leetcode.com/problems/filling-bookcase-shelves/?envType=problem-list-v2&envId=array

    public int minHeightShelves(int[][] books, int shelfWidth) {
        int n = books.length;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;  // Base case: no books require 0 height

        for (int i = 1; i <= n; ++i) {
            int total_width = 0;
            int max_height = 0;
            for (int j = i; j > 0; --j) {
                total_width += books[j-1][0];
                if (total_width > shelfWidth) {
                    break;
                }
                max_height = Math.max(max_height, books[j-1][1]);
                dp[i] = Math.min(dp[i], dp[j-1] + max_height);
            }
        }

        return dp[n];
    }
    public static void main(String[] args) {

    }
}
