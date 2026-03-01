package ProblemsDay_266;

public class CountLargestGroup {

    //https://leetcode.com/problems/count-largest-group/?envType=problem-list-v2&envId=hash-table
    public int countLargestGroup(int n) {
        int[] sums = new int[37];
        for (int i = 1; i <= n; i++) sums[digsum(i)]++;

        int maxi = 0, count = 0;
        for (int i : sums) {
            if (i > maxi) {
                maxi = i;
                count = 1;
            } else if (i == maxi) {
                count++;
            }
        }
        return count;
    }

    private int digsum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {

    }
}
