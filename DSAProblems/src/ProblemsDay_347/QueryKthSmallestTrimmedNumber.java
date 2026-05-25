package ProblemsDay_347;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QueryKthSmallestTrimmedNumber {

//https://leetcode.com/problems/query-kth-smallest-trimmed-number/?envType=problem-list-v2&envId=string

    public int[] smallestTrimmedNumbers(String[] nums, int[][] queries) {
        int q = queries.length;
        int[] result = new int[q];

        for (int i = 0; i < q; i++) {
            int k = queries[i][0];
            int trim = queries[i][1];

            List<Integer> indices = new ArrayList<>();

            for (int j = 0; j < nums.length; j++) {
                indices.add(j);
            }

            Collections.sort(indices, (a, b) -> {
                String s1 = nums[a].substring(nums[a].length() - trim);
                String s2 = nums[b].substring(nums[b].length() - trim);

                int cmp = s1.compareTo(s2);
                if (cmp != 0) return cmp;

                return a - b; // tie-break by index
            });

            result[i] = indices.get(k - 1);
        }

        return result;
    }

    public static void main(String[] args) {

    }
}
