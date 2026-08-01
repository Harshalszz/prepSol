package ProblemsDay_410;

public class JumpGame {

//https://leetcode.com/problems/jump-game/
    public boolean canJump(int[] nums) {
        int maxIndex = 0;

        for(int i=0; i<nums.length ; i++){
            if(i>maxIndex){
                return false;
            }

            maxIndex = Math.max(maxIndex, i+nums[i]);
        }

        return true;
    }
    public static void main(String[] args) {

    }
}
