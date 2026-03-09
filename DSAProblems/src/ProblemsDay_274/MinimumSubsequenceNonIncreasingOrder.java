package ProblemsDay_274;

import java.util.ArrayList;
import java.util.List;

public class MinimumSubsequenceNonIncreasingOrder {

    //https://leetcode.com/problems/minimum-subsequence-in-non-increasing-order/?envType=problem-list-v2&envId=array
    public List<Integer> minSubsequence(int[] nums) {
        int[] freq = new int[101];
        List<Integer> rez = new ArrayList<>();
        int totalSum = 0;
        int subSum = 0;

        for (int num : nums) {
            totalSum += num;
            freq[num]++;
        }

        int half = totalSum / 2;

        for (int i = 100; i >= 1 && subSum <= half; i--) {
            int count = freq[i];

            while (count-- > 0 && subSum <= half) {
                rez.add(i);
                subSum += i;
            }
        }

        return rez;
    }
    public static void main(String[] args) {

    }
}
