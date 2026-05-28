package ProblemsDay_350;

import java.util.HashMap;
import java.util.Map;

public class FlipColumnForMaximumNumberEqualRows {

//https://leetcode.com/problems/flip-columns-for-maximum-number-of-equal-rows/?envType=problem-list-v2&envId=array
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        Map<String, Integer> patterns = new HashMap<>();
        for (int[] currentRow : matrix) {
            String row = "";
            for (int col = 0; col < currentRow.length; col++) {
                if (currentRow[0] == currentRow[col]) {
                    row += "T";
                } else {
                    row += "F";
                }
            }
            patterns.put(row, patterns.getOrDefault(row, 0) + 1);
        }
        int maxFrequency = 0;
        for (int freq : patterns.values()) {
            maxFrequency = Math.max(freq, maxFrequency);
        }
        return maxFrequency;
    }
    public static void main(String[] args) {

    }
}
