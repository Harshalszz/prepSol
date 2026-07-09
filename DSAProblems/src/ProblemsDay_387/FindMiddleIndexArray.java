package ProblemsDay_387;

public class FindMiddleIndexArray {
//https://leetcode.com/problems/find-the-middle-index-in-array/?envType=problem-list-v2&envId=array
    public int findMiddleIndex(int[] nums) {

        int sum = 0;

        for(int num : nums){
            sum += num;
        }

        int leftSum = 0;
        int rightSum = sum;

        for(int i = 0; i < nums.length; i++){

            rightSum -= nums[i];

            if(leftSum == rightSum){
                return i;
            }

            leftSum += nums[i];
        }

        return -1;
    }

    public static void main(String[] args) {

    }
}
