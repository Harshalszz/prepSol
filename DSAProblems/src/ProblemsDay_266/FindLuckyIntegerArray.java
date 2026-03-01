package ProblemsDay_266;

public class FindLuckyIntegerArray {

    //https://leetcode.com/problems/find-lucky-integer-in-an-array/?envType=problem-list-v2&envId=hash-table
    public int findLucky(int[] arr) {

        int[] freq = new int[501]; // constraints say values are <= 500

        // Count frequency of each number
        for (int num : arr) {
            freq[num]++;
        }

        // Check from largest to smallest
        for (int i = 500; i > 0; i--) {
            if (freq[i] == i) {
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {

    }
}
