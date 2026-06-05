package ProblemsDay_358;

public class MinimumOperationsTransformString {
//https://leetcode.com/problems/minimum-operations-to-transform-string/?envType=problem-list-v2&envId=string

    public int minOperations(String s) {
        int ans = 0;
        for (char c : s.toCharArray()) {
            int dist = (26 - (c - 'a')) % 26;
            ans = Math.max(ans, dist);
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
