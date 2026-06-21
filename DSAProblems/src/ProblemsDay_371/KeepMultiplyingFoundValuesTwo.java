package ProblemsDay_371;

import java.util.Arrays;

public class KeepMultiplyingFoundValuesTwo {

//https://leetcode.com/problems/keep-multiplying-found-values-by-two/?envType=problem-list-v2&envId=array
    public int findFinalValue(int[] nums, int original) {

        int res = 1;
        Arrays.sort(nums);

        for(int num : nums){

            if(num == original){
                res = 2*original;
                original = res;
            }
        }

        return res==1?original:res;


    }
    public static void main(String[] args) {

    }
}
