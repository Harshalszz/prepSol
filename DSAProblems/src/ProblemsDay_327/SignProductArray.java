package ProblemsDay_327;

public class SignProductArray {

    //https://leetcode.com/problems/sign-of-the-product-of-an-array/?envType=problem-list-v2&envId=array
    public int arraySign(int[] nums) {
        int sign = 1;

        for (int x : nums) {
            if (x == 0)         return 0;
            if (x < 0)          sign = -sign;  // flip sign
        }

        return sign;
    }

    public static void main(String[] args) {

    }
}
