package ProblemsDay_382;

import java.util.PriorityQueue;
import java.util.Queue;

public class MaximumNumberEatenApples {

//https://leetcode.com/problems/maximum-number-of-eaten-apples/?envType=problem-list-v2&envId=array
    public int eatenApples(final int[] apples, final int[] days) {
        final Queue<int[]> queue = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        final int n = apples.length;

        int day = 0, eaten = 0;

        while(day < n || !queue.isEmpty()) {
            while(!queue.isEmpty() && queue.peek()[1] <= day)
                queue.poll();

            if(day < n) {
                if(apples[day] > 0)
                    queue.offer(new int[] { apples[day], days[day] + day });

                if(!queue.isEmpty()) {
                    queue.peek()[0]--;

                    if(queue.peek()[0] == 0)
                        queue.poll();

                    eaten++;
                }

                day++;
            } else if(!queue.isEmpty()) {
                final int increment = Math.min(queue.peek()[0], queue.poll()[1] - day);

                day += increment;
                eaten += increment;
            }
        }

        return eaten;
    }

    public static void main(String[] args) {

    }
}
