package LinkedList;
/*
876. Middle of the Linked List
Given a non-empty, singly linked list with head node head, return a middle node of the linked list.
If there are two middle nodes, return the second middle node.
Example 1:
Input: [1,2,3,4,5]
Output: Node 3 from this list (Serialization: [3,4,5])
The returned node has value 3.  (The judge's serialization of this node is [3,4,5]).
Note that we returned a ListNode object ans, such that:
ans.val = 3, ans.next.val = 4, ans.next.next.val = 5, and ans.next.next.next = NULL.

Example 2:
Input: [1,2,3,4,5,6]
Output: Node 4 from this list (Serialization: [4,5,6])
Since the list has two middle nodes with values 3 and 4, we return the second one.

 */
public class MiddleOfTheLinkedList {
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
    public ListNode middleLinkedList(ListNode head){
       ListNode once = head;
        ListNode twice = head;
        while(twice != null && twice.next!=null){
            once = once.next;
            twice = twice.next.next;

        }
        return once;
    }
    public static void main(String[] args){
        MiddleOfTheLinkedList obj = new MiddleOfTheLinkedList();
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
        ListNode result = obj.middleLinkedList(head);
        while(result!=null){
            System.out.print(result.val+"\t");
            result = result.next;
        }
    }

}
