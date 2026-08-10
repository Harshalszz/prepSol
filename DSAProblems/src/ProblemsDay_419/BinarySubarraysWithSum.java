package ProblemsDay_419;

public class BinarySubarraysWithSum {

//https://leetcode.com/problems/binary-subarrays-with-sum/?envType=problem-list-v2&envId=sliding-window
    public int numSubarraysWithSum(int[] nums, int goal) {

        int a = helperfun(nums,goal); //counting every posisbel sub array where sum is equal or leass that goal;
        int b = helperfun(nums,goal-1);// counting the everu psosible subarray where sum is equal or less that goal-1;
        // count for sum == goal =>> count(sum<=goal) - count(sum<= goal-1);
        return a-b;

    }

    public static int helperfun(int[] nums, int goal){

        int l=0, r=0, sum=0, count =0;

        if(goal<0){
            return 0;
        }

        while(r<nums.length){

            sum += nums[r];
            while(sum > goal){
                sum -= nums[l];
                l++;
            }

            count += r-l+1;

            r++;
        }

        return count;
    }

    public static void main(String[] args) {

    }
}
