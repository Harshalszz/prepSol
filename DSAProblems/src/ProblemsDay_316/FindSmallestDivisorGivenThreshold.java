package ProblemsDay_316;

public class FindSmallestDivisorGivenThreshold {
//https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/?envType=problem-list-v2&envId=array

    public int smallestDivisor(int[] nums, int threshold) {

        int low = 1;
        int high = Integer.MIN_VALUE;

        // find max element
        for (int num : nums) {
            high = Math.max(high, num);
        }

        int ans = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (getsum(nums, mid) <= threshold) {
                ans = mid;
                high = mid - 1; // try smaller divisor
            } else {
                low = mid + 1; // increase divisor
            }
        }

        return ans;
    }

    public static int getsum(int[] nums, int divisor) {
        int sum = 0;

        for (int num : nums) {
            sum += (num + divisor - 1) / divisor; // integer ceil
        }

        return sum;
    }

    public static void main(String[] args) {

    }
}
