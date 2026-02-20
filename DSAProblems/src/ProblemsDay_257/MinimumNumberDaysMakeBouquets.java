package ProblemsDay_257;

public class MinimumNumberDaysMakeBouquets {

    //https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/?envType=problem-list-v2&envId=array
    public int minDays(int[] bloomDay, int m, int k) {

        long need = (long) m * k;
        if (need > bloomDay.length) return -1;

        // Find min & max day
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int d : bloomDay) {
            min = Math.min(min, d);
            max = Math.max(max, d);
        }

        int low = min;
        int high = max;
        int ans = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (possibleDay(bloomDay, m, k, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    // Helper function
    public boolean possibleDay(int[] bloomDay, int m, int k, int day) {

        int flower = 0;
        int count = 0;

        for (int i = 0; i < bloomDay.length; i++) {

            if (bloomDay[i] <= day) {
                flower++;
            } else {
                count += flower / k;
                flower = 0;
            }
        }

        count += flower / k;

        return count >= m;
    }
    public static void main(String[] args) {

    }
}
