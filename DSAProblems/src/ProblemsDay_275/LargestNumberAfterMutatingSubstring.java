package ProblemsDay_275;

public class LargestNumberAfterMutatingSubstring {

    //https://leetcode.com/problems/largest-number-after-mutating-substring/?envType=problem-list-v2&envId=string
    public String maximumNumber(String num, int[] change) {
        char[] nums = num.toCharArray();
        int n = nums.length;
        int i = 0;



        while(i<n && nums[i]-'0'>=change[nums[i]-'0']){
            i++;
        }


        while(i<n && nums[i]-'0' <= change[nums[i]-'0']){
            nums[i] = (char)(change[nums[i]-'0']+'0');
            i++;
        }

        return new String(nums);
    }
    public static void main(String[] args) {

    }
}
