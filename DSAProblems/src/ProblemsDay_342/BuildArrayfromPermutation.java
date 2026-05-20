package ProblemsDay_342;

public class BuildArrayfromPermutation {

    //https://leetcode.com/problems/build-array-from-permutation/?envType=problem-list-v2&envId=array
    public int[] buildArray(int[] nums) {
        int[] temp = new int[nums.length];
        for (int i = 0; i < nums.length; i++)
            temp[i] = nums[nums[i]];
        return temp;
    }

    public static void main(String[] args) {

    }
}
