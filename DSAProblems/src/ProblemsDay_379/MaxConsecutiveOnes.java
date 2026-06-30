package ProblemsDay_379;

public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {

        int count = 0;
        int maxCount = 0;

        for (int i=0;i<nums.length; i++){
            if(nums[i] == 1){
                count +=1;
            }else {
                maxCount = Math.max(count, maxCount);
                count = 0;
            }

        }

        maxCount = Math.max(count, maxCount);

        return maxCount;

    }

    public static void main(String[] args) {

    }
}
