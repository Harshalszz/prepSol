package ProblemsDay_356;

public class SmallestIndexWithEqualValue {

//https://leetcode.com/problems/smallest-index-with-equal-value/?envType=problem-list-v2&envId=array
    public int smallestEqual(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++)
            if (i % 10 == nums[i])
                return i;
        return -1;
    }
    public static void main(String[] args) {

    }
}
