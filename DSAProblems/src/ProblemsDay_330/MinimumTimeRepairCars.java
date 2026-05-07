package ProblemsDay_330;

public class MinimumTimeRepairCars {

//https://leetcode.com/problems/minimum-time-to-repair-cars/
    public long repairCars(int[] ranks, int cars) {

        long left = 1;
        long right = (long) getMin(ranks) * cars * cars;

        while (left < right) {

            long mid = left + (right - left) / 2;

            if (canRepair(ranks, cars, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private boolean canRepair(int[] ranks, int cars, long time) {

        long total = 0;

        for (int r : ranks) {

            total += (long) Math.sqrt(time / r);

            if (total >= cars) return true;
        }

        return false;
    }

    private int getMin(int[] ranks) {

        int min = Integer.MAX_VALUE;

        for (int r : ranks) {
            min = Math.min(min, r);
        }

        return min;
    }

    public static void main(String[] args) {

    }
}
