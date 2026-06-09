package ProblemsDay_362;

public class CheckAllIntegersRangeAreCovered {

//https://leetcode.com/problems/check-if-all-the-integers-in-a-range-are-covered/?envType=problem-list-v2&envId=array

    public boolean isCovered(int[][] ranges, int left, int right) {
        int[] diff = new int[52];              // 1..50 plus r+1
        for (int[] seg : ranges) {
            diff[seg[0]]++;
            diff[seg[1] + 1]--;
        }
        int cover = 0;
        for (int x = 1; x <= 50; x++) {
            cover += diff[x];
            if (x >= left && x <= right && cover == 0) return false;
            if (x == right) return true;
        }
        return true;
    }
    public static void main(String[] args) {

    }
}
