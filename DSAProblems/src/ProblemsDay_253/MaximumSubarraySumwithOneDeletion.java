package ProblemsDay_253;

public class MaximumSubarraySumwithOneDeletion {

//https://leetcode.com/problems/maximum-subarray-sum-with-one-deletion/?envType=problem-list-v2&envId=array
    public int maximumSum(int[] arr) {
        int ans = arr[0];

        int nodelete = arr[0];
        int onedelete = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            int v1 = arr[i];
            int v4 = nodelete + arr[i];
            int previousnodelete = nodelete;

            nodelete = Math.max(v1, v4);


            int v2 = (onedelete == Integer.MIN_VALUE)
                    ? Integer.MIN_VALUE
                    : onedelete + arr[i];

            int v3 = previousnodelete;

            onedelete = Math.max(v2, v3);

            ans = Math.max(ans, Math.max(onedelete, nodelete));
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
