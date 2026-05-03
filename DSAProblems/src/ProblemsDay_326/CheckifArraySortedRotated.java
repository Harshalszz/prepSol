package ProblemsDay_326;

public class CheckifArraySortedRotated {

    //https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/?envType=problem-list-v2&envId=array
    public boolean check(int[] nums) {

        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }

        return count <= 1;
    }

    public static void main(String[] args) {

    }
}
