package ProblemsDay_425;

import java.util.Arrays;
import java.util.HashSet;

public class ArrayPartition {

//https://leetcode.com/problems/array-partition/?envType=problem-list-v2&envId=sorting

    public int arrayPairSum(int[] nums) {

        Arrays.sort(nums);
        int sum=0;
        HashSet<Integer> result=new HashSet<>();
        for(int i=0;i<nums.length;i+=2){
            sum+=nums[i];
        }
        return sum;

    }

    public static void main(String[] args) {

    }
}
