package ProblemsDay_375;

import java.util.HashSet;
import java.util.Set;

public class MaximumErasureValue {

//https://leetcode.com/problems/maximum-erasure-value/?envType=problem-list-v2&envId=array
    public int maximumUniqueSubarray(int[] nums) {
        int result = 0, currentSum = 0, start = 0;
        Set<Integer> seen = new HashSet<>();

        for (int end = 0; end < nums.length; end++) {

            while (seen.contains(nums[end])) {
                seen.remove(nums[start]);
                currentSum -= nums[start];
                start++;
            }

            currentSum += nums[end];
            seen.add(nums[end]);

            result = Math.max(result, currentSum);
        }

        return result;
    }

    public static void main(String[] args) {

    }
}
