package ProblemsDay_423;

import ProblemsDay2.ListNode;

public class SwapNodesPairs {
//https://leetcode.com/problems/swap-nodes-in-pairs/?envType=problem-list-v2&envId=linked-list
    public ListNode swapPairs(ListNode head) {

        ListNode dummy = new ListNode(0,head);
        ListNode prev = dummy;
        ListNode curr = head;

        while(curr != null && curr.next != null){
            ListNode s = curr.next;
            ListNode sN = curr.next.next;

            s.next = curr;
            curr.next = sN;
            prev.next = s;

            prev = curr;
            curr = sN;
        }

        return dummy.next;
    }
    public static void main(String[] args) {

    }
}
