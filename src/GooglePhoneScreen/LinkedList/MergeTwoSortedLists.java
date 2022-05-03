package GooglePhoneScreen.LinkedList;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MergeTwoSortedLists {
    public static class ListNode{
        int val;
        ListNode next;

        ListNode(){}
        ListNode(int val){
            this.val = val;
        }
    }
    public static ListNode mergeTwoSortedLists(ListNode a, ListNode b){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ListNode p = a;
        ListNode q = b;
        while(p!= null){
            pq.add(p.val);
            p = p.next;
        }

        while(q!= null){
            pq.add(q.val);
            q = q.next;
        }

        if(pq.isEmpty()){
            return null;
        }

        ListNode mergeSorted = new ListNode(pq.poll());
        ListNode traversalPtr = mergeSorted;

        while(!pq.isEmpty()){
            traversalPtr.next = new ListNode(pq.poll());
            traversalPtr = traversalPtr.next;
        }

        return mergeSorted;
    }

    public static void main(String[] args){
        ListNode head1 = new ListNode(1);
        ListNode first1 = new ListNode(2);
        ListNode second1 = new ListNode(4);
        head1.next = first1;
        first1.next = second1;
        second1.next = null;

        ListNode head2 = new ListNode(1);
        ListNode first2 = new ListNode(3);
        ListNode second2 = new ListNode(4);
        head2.next = first2;
        first2.next = second2;
        second2.next = null;

        ListNode result = mergeTwoSortedLists(head1, head2);
        while(result!= null){
            System.out.print(result.val+" ->");
            result = result.next;
        }
    }
}
