package ProblemsDay_352;

public class MaximumSubarrayMinProduct {

//https://leetcode.com/problems/maximum-subarray-min-product/?envType=problem-list-v2&envId=array
    static long[] preSum = new long[(int) 1e5+1];
    static int[] stack = new int[(int) 1e5];
    static int n, r;
    static int modulo = (int) (1e9+7);

    public int maxSumMinProduct(int[] nums) {
        n = nums.length;
        r = 0;
        preSum[0] = 0;
        long ans = 0, product;
        for (int i = 0; i < n; i++) {
            preSum[i+1] = preSum[i]+nums[i];
        }
        for (int i = 0; i < n; i++) {
            while (r > 0 && nums[stack[r-1]] >= nums[i]){
                int index = stack[--r];
                int prev = r == 0 ? -1 : stack[r-1];
                product = (nums[index]*(preSum[i]-preSum[prev+1]));
                ans = Math.max(ans, product);
            }
            stack[r++] = i;
        }
        while (r > 0){
            int index = stack[--r];
            int prev = r == 0 ? -1 : stack[r-1];
            product = nums[index]*(preSum[n]-preSum[prev+1]);
            ans = Math.max(ans, product);
        }
        return (int)(ans%modulo);
    }
    public static void main(String[] args) {

    }
}
