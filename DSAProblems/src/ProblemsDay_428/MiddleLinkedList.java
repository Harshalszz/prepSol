package ProblemsDay_428;

import ProblemsDay2.ListNode;

public class MiddleLinkedList {

//https://leetcode.com/problems/middle-of-the-linked-list/?envType=problem-list-v2&envId=linked-list
    public ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while( fast !=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;

    }
    public static void main(String[] args) {

    }
}
