package ProblemsDay_324;

public class TrappingRainWater {
//https://leetcode.com/problems/trapping-rain-water/

    public int trap(int[] nums) {

        int leftMax = 0 , rightMax = 0 , res = 0;
        int l = 0 , r= nums.length -1 ;

        while(l<r){

            if(nums[l] <= nums[r]){
                if(nums[l] < leftMax){
                    res += leftMax - nums[l];
                }else{
                    leftMax = nums[l];
                }

                l++;
            }else{
                if(nums[r] <rightMax){
                    res += rightMax - nums[r];
                }else{
                    rightMax= nums[r];
                }
                r--;
            }
        }

        return res;

    }
    public static void main(String[] args) {

    }
}
