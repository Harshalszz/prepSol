package ProblemsDay_368;

import java.util.Arrays;

public class MinimumAmountTimeFillCups {
//https://leetcode.com/problems/minimum-amount-of-time-to-fill-cups/?envType=problem-list-v2&envId=array

    public int fillCups(int[] amount) {
        int count = 0;
        while (true) {
            Arrays.sort(amount);
            if (amount[2] == 0) break;
            amount[2]--;
            if (amount[1] > 0) {
                amount[1]--;
            }
            count++;
        }
        return count;
    }
    public static void main(String[] args) {

    }
}
