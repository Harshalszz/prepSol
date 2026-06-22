package ProblemsDay_372;

public class MaximumSumWithExactlyKElements {

//https://leetcode.com/problems/maximum-sum-with-exactly-k-elements/?envType=problem-list-v2&envId=array
    public int maximizeSum(int[] nums, int k) {
        int max = 0;

        for (int num : nums) {
            max = max < num ? num : max;
        }

        return k * max + (k * (k - 1)) / 2;
    }

    public static void main(String[] args) {

    }
}
