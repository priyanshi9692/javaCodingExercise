package LinkedList;
/*
234. Palindrome Linked List
Given a singly linked list, determine if it is a palindrome.

Example 1:

Input: 1->2
Output: false
Example 2:

Input: 1->2->2->1
Output: true
 */

public class PalindromLinkedList {
    public static class ListNode {
        int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
    public boolean isPalindrom(ListNode head ){
        //Create a new ListNode p and reserve the value of head in that
        ListNode p = head;
        // initialize a listnode prev with the value of head node
        ListNode prev = new ListNode(head.val);
        //Iterate on p
        while (p.next!=null){
            ListNode curr = new ListNode(p.next.val);
            curr.next = prev;
            prev = curr;
            p = p.next;
        }
        ListNode p1 = head;
        ListNode p2 = prev;
        while (p1!= null){
            if(p1.val != p2.val){
                return false;
            }
            p1= p1.next;
            p2= p2.next;
        }
        return true;
    }
    public static void main(String[] args){
      PalindromLinkedList obj = new PalindromLinkedList();
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        head.next=second;
        second.next=third;
        third.next=null;

        System.out.println(obj.reverseList(head));
    }
}
