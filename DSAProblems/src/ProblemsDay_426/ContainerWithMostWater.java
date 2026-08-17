package ProblemsDay_426;

public class ContainerWithMostWater {

    //https://leetcode.com/problems/container-with-most-water/?envType=problem-list-v2&envId=greedy
    public int maxArea(int[] nums) {

        int l =0, r = nums.length - 1;
        int res = 0;

        while (l<r){
            if(nums[l] < nums[r]){
                res = Math.max(res,(r-l)* nums[l]);
                l++;
            }else{
                res = Math.max(res,(r-l)* nums[r]);
                r--;
            }
        }

        return res;

    }

    public static void main(String[] args) {

    }
}
