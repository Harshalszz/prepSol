package ProblemsDay_439;

import ProblemsDay2.ListNode;

public class LinkedListCycle {

//https://leetcode.com/problems/linked-list-cycle/?envType=problem-list-v2&envId=linked-list
    public boolean hasCycle(ListNode head) {

        ListNode slow = head, fast =head;

        while(fast !=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

    }
}
