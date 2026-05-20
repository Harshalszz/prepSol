package ProblemsDay_342;

public class MinimumOperationsMaketheArrayIncreasing {
//https://leetcode.com/problems/minimum-operations-to-make-the-array-increasing/?envType=problem-list-v2&envId=array
    public int minOperations(int[] nums) {
        int n = nums.length;
        int ans = 0;
        int curr = nums[0];
        for (int i = 1; i < n; i++) {
            if (nums[i] <= curr) {
                curr++;
                ans += curr - nums[i];
            } else
                curr = nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
