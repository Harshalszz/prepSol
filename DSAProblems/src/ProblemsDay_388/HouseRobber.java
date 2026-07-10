package ProblemsDay_388;

public class HouseRobber {

//https://leetcode.com/problems/house-robber/
    public int rob(int[] nums) {

        int prevMax=0, currMax = 0;

        for(int i=0; i<nums.length; i++){

            int temp = Math.max(currMax, prevMax + nums[i]);

            prevMax=currMax;
            currMax=temp;
        }

        return currMax;

    }
    public static void main(String[] args) {

    }
}
