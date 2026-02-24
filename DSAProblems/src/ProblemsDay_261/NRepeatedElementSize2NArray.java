package ProblemsDay_261;

public class NRepeatedElementSize2NArray {

    //https://leetcode.com/problems/n-repeated-element-in-size-2n-array/?envType=problem-list-v2&envId=array
    public int repeatedNTimes(int[] nums) {
        int n = nums.length - 2;
        for(int i = 0; i < n; i++) {
            if(nums[i] == nums[i + 1] || nums[i] == nums[i + 2]) return nums[i];
        }
        return nums[n + 1];
    }
    public static void main(String[] args) {

    }
}
