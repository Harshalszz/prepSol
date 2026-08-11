package ProblemsDay_420;

public class MaximumWidthRamp {

//https://leetcode.com/problems/maximum-width-ramp/?envType=problem-list-v2&envId=two-pointers
    public int maxWidthRamp(int[] nums) {
        int n = nums.length;
        int[] rightMax = new int[n];
        rightMax[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 0; i--)
            rightMax[i] = Math.max(rightMax[i + 1], nums[i]);

        int left = 0, right = 0, maxVal = 0;

        while (right < n) {
            while (right<n && nums[left]<=rightMax[right])
                right++;
            maxVal = Math.max(maxVal, right - left-1);
            left++;
            right = left + maxVal + 1;
        }

        return maxVal;
    }

    public static void main(String[] args) {

    }
}
