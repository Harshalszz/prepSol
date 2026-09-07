package ProblemsDay_443;

import ProblemsDay2.ListNode;

public class SortList {
//https://leetcode.com/problems/sort-list/?envType=problem-list-v2&envId=merge-sort
    public ListNode sortList(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }
        ListNode temp=head;
        ListNode slow=head;
        ListNode fast=head;

        while(fast != null && fast.next != null){
            temp = slow;
            slow =slow.next;
            fast = fast.next.next;

        }

        temp.next = null;

        ListNode leftStored = sortList(head);
        ListNode rightStored = sortList(slow);

        ListNode result = mergeList(leftStored,rightStored);

        return result;

    }

    public static ListNode mergeList(ListNode l1, ListNode l2){

        ListNode newStoreList = new ListNode(0);
        ListNode temp = newStoreList;

        while(l1 !=null && l2 !=null){
            if(l1.val < l2.val){
                temp.next = l1;
                l1 = l1.next;
            }else {
                temp.next = l2;
                l2 = l2.next;
            }

            temp = temp.next;
        }

        if(l1 != null){
            temp.next = l1;
            l1 = l1.next;
        }

        if(l2 != null){
            temp.next = l2;
            l2 = l2.next;
        }

        return newStoreList.next;
    }
    public static void main(String[] args) {

    }
}
