package ProblemsDay_379;

public class ConcatenationArray {
//https://leetcode.com/problems/concatenation-of-array/

    public int[] getConcatenation(int[] nums) {

        int ans[] = new int[nums.length * 2];

        for (int i = 0; i < ans.length; i++) {
            ans[i] = nums[i % nums.length];
        }

        return ans;
    }

    public static void main(String[] args) {

    }
}
