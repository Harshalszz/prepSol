package ProblemsDay_251;

public class MinimumTimeVisitingAllPoints {

//https://leetcode.com/problems/minimum-time-visiting-all-points/?envType=problem-list-v2&envId=array
    public int minTimeToVisitAllPoints(int[][] points) {
        int ans = 0;
        for(int i = 1; i < points.length; i++) {
            ans += Math.max(Math.abs(points[i][0] - points[i - 1][0]), Math.abs(points[i][1] - points[i - 1][1]));
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
