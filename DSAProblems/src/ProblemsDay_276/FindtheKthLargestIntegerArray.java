package ProblemsDay_276;

import java.math.BigInteger;
import java.util.PriorityQueue;

public class FindtheKthLargestIntegerArray {

//https://leetcode.com/problems/find-the-kth-largest-integer-in-the-array/?envType=problem-list-v2&envId=string
    public String kthLargestNumber(String[] nums, int k) {
        var pq = new PriorityQueue<BigInteger>();

        for (String s : nums) {
            pq.add(new BigInteger(s));
            if (pq.size() > k) {
                pq.poll();
            }
        }

        return pq.peek().toString();
    }
    public static void main(String[] args) {

    }
}
