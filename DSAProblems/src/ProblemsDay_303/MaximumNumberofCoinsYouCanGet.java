package ProblemsDay_303;

import java.util.Arrays;

public class MaximumNumberofCoinsYouCanGet {
//https://leetcode.com/problems/maximum-number-of-coins-you-can-get/?envType=problem-list-v2&envId=array

    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int r = piles.length;
        int count = 0;

        for (int i = 0; i < piles.length / 3; i++) {
            count += piles[r - 2];
            r -= 2;
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
