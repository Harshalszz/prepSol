package ProblemsDay_370;

import java.util.ArrayDeque;
import java.util.Deque;

public class JumpGameVI {
//https://leetcode.com/problems/jump-game-vi/?envType=problem-list-v2&envId=array

    public int maxResult(int[] nums, int k) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];

        // deque stores indices of dp[], front = max in current window
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addLast(0);

        for (int i = 1; i < n; i++) {
            // max dp in window is at dq.peekFirst()
            dp[i] = nums[i] + dp[dq.peekFirst()];

            // remove indices whose dp is smaller than current dp[i]
            while (!dq.isEmpty() && dp[i] >= dp[dq.peekLast()]) {
                dq.pollLast();
            }
            dq.addLast(i);

            // remove indices out of k-step window
            if (i - dq.peekFirst() >= k) {
                dq.pollFirst();
            }
        }

        return dp[n - 1];
    }
    public static void main(String[] args) {

    }
}
