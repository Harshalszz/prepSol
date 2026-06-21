package ProblemsDay_371;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NumberDistinctAverages {

//https://leetcode.com/problems/number-of-distinct-averages/?envType=problem-list-v2&envId=array
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);

        Set<Integer> set = new HashSet<>();

        int n = nums.length;

        for (int i = 0; i < n / 2; i++) {
            int sum = nums[i] + nums[n - 1 - i];
            set.add(sum);
        }

        return set.size();
    }

    public static void main(String[] args) {

    }
}
