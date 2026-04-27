package ProblemsDay_320;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HighAccessEmployees {

//https://leetcode.com/problems/high-access-employees/?envType=problem-list-v2&envId=string
    private int convertToMinutes(String timeStr) {
        int hour = Integer.parseInt(timeStr.substring(0, 2));
        int minute = Integer.parseInt(timeStr.substring(2, 4));
        return hour * 60 + minute;
    }

    public List<String> findHighAccessEmployees(List<List<String>> access_times) {
        // Sort logs: first by name, then by time
        Collections.sort(access_times, (a, b) -> {
            int cmp = a.get(0).compareTo(b.get(0));
            if (cmp == 0) {
                return a.get(1).compareTo(b.get(1));
            }
            return cmp;
        });

        List<String> result = new ArrayList<>();

        int i = 0;
        while (i < access_times.size()) {
            String name = access_times.get(i).get(0);
            List<Integer> times = new ArrayList<>();
            int j = i;

            // Collect all access times for this employee
            while (j < access_times.size() && access_times.get(j).get(0).equals(name)) {
                times.add(convertToMinutes(access_times.get(j).get(1)));
                j++;
            }

            // Check for any 3 times within 60 minutes using sliding window
            boolean found = false;
            for (int start = 0, end = 0; end < times.size(); end++) {
                while (times.get(end) - times.get(start) >= 60) {
                    start++;
                }
                if (end - start + 1 >= 3) {
                    found = true;
                    break;
                }
            }

            if (found) {
                result.add(name);
            }

            i = j;  // Move to next employee
        }

        return result;
    }
    public static void main(String[] args) {

    }
}
