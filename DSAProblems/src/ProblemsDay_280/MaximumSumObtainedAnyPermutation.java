package ProblemsDay_280;

import java.util.Arrays;

public class MaximumSumObtainedAnyPermutation {

    //https://leetcode.com/problems/maximum-sum-obtained-of-any-permutation/?envType=problem-list-v2&envId=array

    int MOD = 1000000007;
    public int maxSumRangeQuery(int[] nums, int[][] requests) {
        int n = nums.length;
        int[] events = new int[n];
        for( int[] req : requests ) {
            int start = req[0];
            int end = req[1];

            events[start] += 1;
            if( end + 1 < n ) {                 // here we take the [start, end] to take the end part also we do the end + 1.
                events[end + 1] -= 1;           //we do end + 1 becuase we include the start and end both.
            }
        }

        // cumulative sum;
        for( int i = 1; i < n; i++ ) {
            events[i] += events[i - 1];
        }

        long result = 0;
        Arrays.sort( events );
        Arrays.sort( nums );

        for( int i = n - 1; i >= 0 ; i-- ) {
            long res = (long) events[i] * nums[i];
            result = ( result + res ) % MOD;
        }
        return (int) result;
    }
    public static void main(String[] args) {

    }
}
