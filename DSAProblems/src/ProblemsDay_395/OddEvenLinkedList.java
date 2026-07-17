package ProblemsDay_395;

import ProblemsDay2.ListNode;

public class OddEvenLinkedList {
//https://leetcode.com/problems/odd-even-linked-list/

    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode odd=head,even=head.next;
        ListNode evenHead=head.next;

        while(even != null  && even.next != null){
            odd.next=odd.next.next;
            even.next=even.next.next;

            odd=odd.next;
            even=even.next;
        }
        odd.next=evenHead;
        return head;

    }
    public static void main(String[] args) {

    }
}
