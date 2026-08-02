package ProblemsDay_411;

public class SingleNumberII {

//https://leetcode.com/problems/single-number-ii/
    public int singleNumber(int[] nums) {
        int ones = 0, twos = 0;
        for (int num : nums) {
            ones = (ones ^ num) & ~twos;
            twos = (twos ^ num) & ~ones;
        }
        return ones;
    }

    public static void main(String[] args) {

    }
}
