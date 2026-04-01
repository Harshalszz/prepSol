package ProblemsDay_297;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumAreaRectangleII {

    //https://leetcode.com/problems/minimum-area-rectangle-ii/?envType=problem-list-v2&envId=array
    public double minAreaFreeRect(int[][] points) {
        int n = points.length;
        Map<String, List<int[]>> map = new HashMap<>();
        double minArea = Double.MAX_VALUE;

        // Step 1: Generate all point pairs and group them by same midpoint and diagonal length
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                int x1 = points[i][0], y1 = points[i][1];
                int x2 = points[j][0], y2 = points[j][1];

                int centerX = x1 + x2;
                int centerY = y1 + y2;
                int distSq = (x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2);

                String key = centerX + "," + centerY + "," + distSq;
                map.computeIfAbsent(key, k -> new ArrayList<>()).add(new int[]{i, j});
            }
        }

        // Step 2: For each group with same midpoint and distance, check if they can form a rectangle
        for (List<int[]> group : map.values()) {
            int size = group.size();
            for (int i = 0; i < size; ++i) {
                for (int j = i + 1; j < size; ++j) {
                    int[] pair1 = group.get(i);
                    int[] pair2 = group.get(j);

                    int[] A = points[pair1[0]];
                    int[] B = points[pair1[1]];
                    int[] C = points[pair2[0]];

                    double side1 = distance(A, C);
                    double side2 = distance(B, C);

                    double area = side1 * side2;
                    if (area < minArea && area != 0) {
                        minArea = area;
                    }
                }
            }
        }

        return minArea == Double.MAX_VALUE ? 0 : minArea;
    }

    private double distance(int[] a, int[] b) {
        int dx = a[0] - b[0];
        int dy = a[1] - b[1];
        return Math.sqrt(dx * dx + dy * dy);
    }
    public static void main(String[] args) {

    }
}
