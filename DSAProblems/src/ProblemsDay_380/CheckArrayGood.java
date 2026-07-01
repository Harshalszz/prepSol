package ProblemsDay_380;

import java.util.HashSet;
import java.util.Set;

public class CheckArrayGood {

//https://leetcode.com/problems/check-if-array-is-good/?envType=problem-list-v2&envId=array
    public boolean isGood(int[] nums) {
        int n = nums.length - 1;
        Set<Integer> seen = new HashSet<>();
        boolean dup = false;

        for (int num : nums) {
            if (num > n) return false;

            if (seen.contains(num)) {
                if (num < n || dup) return false;
                dup = true;
                continue;
            }

            seen.add(num);
        }

        return true;
    }

    public static void main(String[] args) {

    }
}
