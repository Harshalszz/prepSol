package ProblemsDay_369;

import java.util.HashMap;
import java.util.Map;

public class CountElementsWithMaximumFrequency {

//https://leetcode.com/problems/count-elements-with-maximum-frequency/?envType=problem-list-v2&envId=array
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        int frequency = 0, count = 0;

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for (int val : freq.values()) {
            if (val == frequency) {
                count++;
            } else if (val > frequency) {
                frequency = val;
                count = 1;
            }
        }

        return frequency * count;
    }

    public static void main(String[] args) {

    }
}
