package ProblemsDay_321;

public class MinimumNumbersFunctionCallsMakeTargetArray {

//https://leetcode.com/problems/minimum-numbers-of-function-calls-to-make-target-array/?envType=problem-list-v2&envId=array
    public int minOperations(int[] nums) {
        int stepdouble = 0, stepadd = 0;
        for (int num : nums) {
            int x = (int) (Math.log(num)/Math.log(2));
            if (x > stepdouble) stepdouble = x ;
            int cur = 0;
            while (num != 0) {
                stepadd += num % 2;
                num/=2;
            }

        }
        return stepadd + stepdouble;

    }

    public static void main(String[] args) {

    }
}
