package GooglePhoneScreen.LinkedList;

import java.util.List;

public class AddTwoNumbers {
    public static class ListNode{
        int val;
        ListNode next;

        ListNode(){}
        ListNode(int val){
            this.val = val;
        }
    }

    public static ListNode addTwoNumbers(ListNode a, ListNode b){
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        ListNode first = a;
        ListNode second = b;
        int carry = 0;
        while(first!= null || second!= null){
            int x = first!= null ? first.val : 0;
            int y = second!= null ? second.val : 0;

            int sum = x+y+carry;

            carry = sum/10;

            curr.next = new ListNode(sum%10);
            curr = curr.next;

            if(first!= null){
                first = first.next;
            }

            if(second!= null){
                second = second.next;
            }
        }

        if(carry>0){
            curr.next = new ListNode(carry);
        }

        return dummyHead.next;
    }

    public static void main(String[] args){
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

        ListNode addition = addTwoNumbers(head, head1);

        while(addition!= null){
            System.out.print(addition.val+" ->");
            addition = addition.next;
        }
    }
}
