package ProblemsDay_312;

import java.util.Arrays;

public class LastMomentBeforeAllAntsFallOutPlank {
//https://leetcode.com/problems/last-moment-before-all-ants-fall-out-of-a-plank/?envType=problem-list-v2&envId=array

    public int getLastMoment(int n, int[] left, int[] right) {
        int maxLeft = left.length == 0 ? 0 : Arrays.stream(left).max().getAsInt();
        int minRight = right.length == 0 ? n : Arrays.stream(right).min().getAsInt();
        return Math.max(maxLeft, n - minRight);
    }

    public static void main(String[] args) {

    }
}
