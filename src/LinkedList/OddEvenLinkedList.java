package LinkedList;
/*
328. Odd Even Linked List
Given a singly linked list, group all odd nodes together followed by the even nodes.
Please note here we are talking about the node number and not the value in the nodes.

You should try to do it in place.
The program should run in O(1) space complexity and O(nodes) time complexity.

Example 1:

Input: 1->2->3->4->5->NULL
Output: 1->3->5->2->4->NULL
Example 2:

Input: 2->1->3->5->6->4->7->NULL
Output: 2->3->6->7->1->5->4->NULL
 */

public class OddEvenLinkedList {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() { }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

        public ListNode oddEvenList(ListNode head){
            if(head == null || head.next == null){
                return head;
            }
            ListNode odd = head;
            ListNode even = head.next;
            ListNode save = even;
            while(even!= null && even.next!= null){
                odd.next = even.next;
                odd = odd.next;
                even.next = odd.next;
                even = even.next;
            }
            odd.next = save;

        return head;
        }

    public static void main (String[] args){
        OddEvenLinkedList obj = new OddEvenLinkedList();
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = null;

        ListNode nodes = head;
        while(nodes!=null){
            System.out.println(nodes.val);
            nodes = nodes.next;
        }

     ListNode current = obj.oddEvenList(head);
      while(current!=null){
          System.out.println(current.val);
          current = current.next;
      }

    }

}
