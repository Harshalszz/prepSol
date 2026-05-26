package ProblemsDay_348;

public class MinimumDistanceTargetElement {
//https://leetcode.com/problems/minimum-distance-to-the-target-element/?envType=problem-list-v2&envId=array

    public int getMinDistance(int[] nums, int target, int start) {

        int res = 0, minRes = Integer.MAX_VALUE;

        for(int i=0; i<nums.length ; i++){
            if(nums[i] == target){
                res = Math.abs(start-i);
                minRes = Math.min(res, minRes);
            }
        }

        return minRes;

    }
    public static void main(String[] args) {

    }
}
