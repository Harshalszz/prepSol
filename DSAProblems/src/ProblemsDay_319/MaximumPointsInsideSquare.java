package ProblemsDay_319;

import java.util.HashMap;
import java.util.Map;

public class MaximumPointsInsideSquare {
//https://leetcode.com/problems/maximum-points-inside-the-square/?envType=problem-list-v2&envId=string
    public int maxPointsInsideSquare(int[][] points, String s) {
        Map<Character, Integer> map = new HashMap<>();
        int ans = 0;
        int secmin = Integer.MAX_VALUE;

        for (int i = 0; i < points.length; i++) {
            char c = s.charAt(i);
            int l = Math.max(Math.abs(points[i][0]), Math.abs(points[i][1]));

            if (map.containsKey(c))
                if (map.get(c) > l) {
                    secmin = Math.min(map.get(c), secmin);
                    map.put(c, l);
                }
                else
                    secmin = Math.min(l, secmin);
            else
                map.put(c, l);
        }
        for (int i : map.values())
            if (secmin > i)
                ans += 1;

        return ans;
    }

    public static void main(String[] args) {

    }
}
