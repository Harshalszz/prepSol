package ProblemsDay_285;

public class MinimumRecolorsGetKConsecutivBlackBlocks {

    //https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks/?envType=problem-list-v2&envId=string
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int minOperations = Integer.MAX_VALUE;

        // Iterate through the string with a sliding window of size k
        for (int i = 0; i <= n - k; i++) {
            int whiteCount = 0;

            // Count the number of 'W's in the current window
            for (int j = i; j < i + k; j++) {
                if (blocks.charAt(j) == 'W') {
                    whiteCount++;
                }
            }

            // Update the minimum number of operations
            minOperations = Math.min(minOperations, whiteCount);
        }
        return minOperations;
    }
    public static void main(String[] args) {

    }
}
