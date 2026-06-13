package ProblemsDay_365;

import java.util.ArrayDeque;
import java.util.Deque;

public class CountSubmatricesWithAllOnes {

//https://leetcode.com/problems/count-submatrices-with-all-ones/?envType=problem-list-v2&envId=array
    public int numSubmat(int[][] mat) {
        int r = mat.length, c = mat[0].length;
        int[] h = new int[c];
        int ans = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                h[j] = (mat[i][j] == 0) ? 0 : h[j] + 1;
            }
            ans += count(h);
        }
        return ans;
    }

    private int count(int[] h) {
        int n = h.length, res = 0;
        int[] sum = new int[n];
        Deque<Integer> st = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && h[st.peek()] >= h[i]) st.pop();
            if (!st.isEmpty()) {
                int p = st.peek();
                sum[i] = sum[p] + h[i] * (i - p);
            } else {
                sum[i] = h[i] * (i + 1);
            }
            st.push(i);
            res += sum[i];
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
