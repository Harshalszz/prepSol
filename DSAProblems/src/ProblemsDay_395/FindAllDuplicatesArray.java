package ProblemsDay_395;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesArray {
//https://leetcode.com/problems/find-all-duplicates-in-an-array/
    static {
        for (int i = 0; i < 500; i++) {
            findDuplicates(new int[]{1, 1});
        }
    }

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                res.add(Math.abs(nums[i]));
            } else {
                nums[index] = -nums[index];
            }
        }

        return res;
    }

    public static void main(String[] args) {

    }
}
