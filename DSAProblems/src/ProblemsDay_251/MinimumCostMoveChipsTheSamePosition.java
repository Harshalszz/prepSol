package ProblemsDay_251;

public class MinimumCostMoveChipsTheSamePosition {

//https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/?envType=problem-list-v2&envId=array
    public int minCostToMoveChips(int[] position) {
        int evenCount = 0;
        int oddCount = 0;

        for (int pos : position) {
            if (pos % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        return Math.min(oddCount, evenCount);
    }
    public static void main(String[] args) {

    }
}
