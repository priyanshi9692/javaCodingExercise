package LinkedList;
/*
Given a linked list, swap every two adjacent nodes and return its head.

You may not modify the values in the list's nodes, only nodes itself may be changed.

Example:

Given 1->2->3->4, you should return the list as 2->1->4->3.
*/

public class SwapNodesInPairs {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }
    public ListNode swapNodesInPairs(ListNode head){
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode current = temp;
        while(current.next!= null && current.next.next!= null){
            ListNode first = current.next;
            ListNode second = current.next.next;
            first.next = second.next;
            current.next = second;
            current.next.next = first;
            current = current.next.next;
        }
        return temp.next;
    }
    public static void main(String[] args){
        SwapNodesInPairs obj = new SwapNodesInPairs();
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = null;
        ListNode result = obj.swapNodesInPairs(head);
        while(result != null){
            System.out.print(result.val+","+"\t");
            result = result.next;
        }

    }
}
