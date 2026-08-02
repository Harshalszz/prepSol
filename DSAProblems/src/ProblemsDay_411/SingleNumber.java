package ProblemsDay_411;

public class SingleNumber {
//https://leetcode.com/problems/single-number/
    public int singleNumber(int[] nums) {

        // if(nums.length == 1){
        //     return nums[0];
        // }

        // int res = nums[0];

        // for(int i=1; i<nums.length; i++){
        //     res = res^nums[i];
        // }

        // return res;

        int ans  = 0;
        for(int i=0; i<nums.length; i++){
            ans ^=nums[i];
        }

        return ans;

    }

    public static void main(String[] args) {

    }
}
