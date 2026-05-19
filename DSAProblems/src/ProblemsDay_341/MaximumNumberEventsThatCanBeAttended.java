package ProblemsDay_341;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MaximumNumberEventsThatCanBeAttended {
// https://leetcode.com/problems/maximum-number-of-events-that-can-be-attended/?envType=problem-list-v2&envId=array

    public int maxEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> Integer.compare(a[0], b[0]));

        int day = 0, index = 0 , n = events.length ,result = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        while (!pq.isEmpty() || index < n) {
            if (pq.isEmpty()) {
                day = events[index][0];
            }
            while (index < n && events[index][0] <= day) {
                pq.offer(events[index][1]);
                index++;
            }
            pq.poll();
            result++;
            day++;

            while (!pq.isEmpty() && pq.peek() < day) {
                pq.poll();
            }
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
