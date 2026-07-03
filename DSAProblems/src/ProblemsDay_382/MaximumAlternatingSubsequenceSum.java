package ProblemsDay_382;

public class MaximumAlternatingSubsequenceSum {
//https://leetcode.com/problems/maximum-alternating-subsequence-sum/?envType=problem-list-v2&envId=array

    Long[][] dp;
    public long maxAlternatingSum(int[] nums) {
        // dp = new Long[nums.length][2];
        // return recursionHelper(nums, nums.length - 1, false);

        return bottomUpDpHelper(nums);
    }

    /*

            pick = 0th index
            not pikc = 1st index

            dp[i][0] = nums[index] or -nums[index]


    */
    public long bottomUpDpHelper(int[] nums) {
        long[][] dp = new long[nums.length][2];

        dp[0][0] = nums[0];
        dp[0][1] = 0;

        for (int i = 1;  i < nums.length; i++) {
            dp[i][0] = Math.max(nums[i] + dp[i-1][1], dp[i-1][0]);
            dp[i][1] = Math.max(-nums[i] + dp[i-1][0], dp[i-1][1]);
        }

        return Math.max(dp[nums.length - 1][0], dp[nums.length - 1][1]);
    }

    public long recursionHelper(int[] nums, int index, boolean isOdd) {
        if (index < 0) {
            return 0;
        }
        int j = 0;
        if (isOdd) {
            j = 1;
        }

        if (dp[index][j] != null) {
            return dp[index][j];
        }

        long sum = 0;
        long pick = 0, notPick = 0;

        sum = !isOdd ? (long) nums[index] : (long) -nums[index];

        pick = sum + recursionHelper(nums, index - 1, !isOdd);
        notPick = recursionHelper(nums, index - 1, isOdd);

        return dp[index][j] = Math.max(pick, notPick);
    }

    public static void main(String[] args) {

    }
}
