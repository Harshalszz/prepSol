package ProblemsDay_267;

import ProblemsDay2.ListNode;

import java.util.ArrayList;

public class LinkedListRandomNode {

    //https://leetcode.com/problems/linked-list-random-node/?envType=problem-list-v2&envId=math
    class Solution {
        ArrayList<Integer> nodes = new ArrayList<Integer>();
        public Solution(ListNode head) {
            while (head != null) {
                nodes.add(head.val);
                head = head.next;
            }
        }

        public int getRandom() {
            int i = (int)(Math.random() * this.nodes.size());
            return this.nodes.get(i);
        }
    }
    public static void main(String[] args) {

    }
}
