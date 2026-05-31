package ProblemsDay_353;

import java.util.Arrays;

public class MinimumDifferenceBetweenHighestLowestcores {
//https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/?envType=problem-list-v2&envId=array

    static public int minimumDifference(int[] nums, int k) {
        final int n=nums.length;
        if (k==1) return 0;
        Arrays.sort(nums);
        int diff=Integer.MAX_VALUE;
        for(int l=0, r=k-1; r<n; ){
            diff=Math.min(diff, nums[r++]-nums[l++]);
        }
        return diff;
    }

    public static void main(String[] args) {

    }
}
