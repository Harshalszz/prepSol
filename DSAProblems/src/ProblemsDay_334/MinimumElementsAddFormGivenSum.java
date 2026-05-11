package ProblemsDay_334;

public class MinimumElementsAddFormGivenSum {
//https://leetcode.com/problems/minimum-elements-to-add-to-form-a-given-sum/?envType=problem-list-v2&envId=array
    public int minElements(int[] nums, int limit, int goal) {
        int n = nums.length;
        long sum = 0;
        long diff = 0;
        for(int i=0;i<n;i++){
            sum += nums[i];
        }
        diff = Math.abs(goal-sum);
        return (int) ((diff+limit-1)/limit);
    }
    public static void main(String[] args) {

    }
}
