package ProblemsDay_331;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaximizeFixedPointsAfterDeletions {

//https://leetcode.com/problems/maximize-fixed-points-after-deletions/
    public int maxFixedPoints(int[] A) {
        List<Integer> s = new ArrayList<>();
        List<int[]> B = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            if (i >= A[i]) {
                B.add(new int[]{i - A[i], A[i]});
            }
        }
        Collections.sort(B, (a, b) -> {
            if (a[0] != b[0]) return Integer.compare(a[0], b[0]);
            return Integer.compare(a[1], b[1]);
        });

        // LIS
        for (int[] p : B) {
            int x = p[1];
            int left = 0, right = s.size();
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (s.get(mid) >= x) right = mid;
                else left = mid + 1;
            }
            if (left == s.size()) s.add(x);
            else s.set(left, x);
        }
        return s.size();
    }

    public static void main(String[] args) {

    }
}
