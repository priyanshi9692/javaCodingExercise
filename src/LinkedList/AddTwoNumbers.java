package LinkedList;
/*
You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order and each of their nodes contain a single digit.
Add the two numbers and return it as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.
*/

public class AddTwoNumbers {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public static ListNode addTwoNumbers(ListNode one, ListNode two){
        ListNode dummy = new ListNode(0);
        ListNode p = one;
        ListNode q = two;
        ListNode current = dummy;

        int carry = 0;

        while(p!= null || q!= null){
            int x = p!= null ? p.val : 0;
            int y = q!= null ? q.val : 0;

            int sum = x+y+carry;
            carry = sum/10;
            current.next = new ListNode(sum%10);
            current = current.next;

            if(p!= null){
                p = p.next;
            }
            if(q!= null){
                q = q.next;
            }

            if(carry>0){
                current.next = new ListNode(carry);
            }
        }
        return dummy.next;
    }
    public static void main(String [] args){
        ListNode head = new ListNode(2);
        ListNode first = new ListNode(4);
        ListNode second = new ListNode(3);
        head.next = first;
        first.next = second;
        second.next = null;

        ListNode head1 = new ListNode(5);
        ListNode first1 = new ListNode(6);
        ListNode second1 = new ListNode(4);
        head1.next = first1;
        first1.next = second1;
        second1.next = null;

        ListNode result = addTwoNumbers(head, head1);

        while(result!= null){
            System.out.print(result.val+"->");
            result = result.next;
        }

    }
}
