package ProblemsDay_376;

import java.util.Arrays;

public class MaxPairSumArray {

//https://leetcode.com/problems/max-pair-sum-in-an-array/?envType=problem-list-v2&envId=array
    public int maxSum(int[] nums) {

        int maxSum = -1;
        int[] best = new int[10];
        Arrays.fill(best, -1);

        for (int num : nums) {

            int digit = maxDigit(num);

            if (best[digit] != -1) {
                int sum = best[digit] + num;
                maxSum = maxSum > sum ? maxSum : sum;
            }

            if (num > best[digit]) {
                best[digit] = num;
            }
        }

        return maxSum;
    }

    private int maxDigit(int num) {

        int max = 0;

        while (num > 0) {
            int last = num % 10;
            max = max < last ? last : max;
            num /= 10;
        }

        return max;
    }
    public static void main(String[] args) {

    }
}
