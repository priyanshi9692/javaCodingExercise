package LinkedList;
/*
You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order and each of their nodes contain a single digit.
Add the two numbers and return it as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.
*/

public class AddTwoNumbers {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public ListNode addTwoNumbers(ListNode one, ListNode two){
        ListNode fake = new ListNode(0);
        ListNode p = fake;
        ListNode p1 = one;
        ListNode p2 = two;
        int carry = 0;
        while(p1!=null || p2!=null){
            int sum = carry;
            if(p1!=null){
                sum += p1.val;
                p1= p1.next;
            }
            if(p2!=null){
                sum += p2.val;
                p2 = p2.next;
            }
            if(sum>9){
                carry = 1;
                sum = sum - 10;
            }
            else{
                carry = 0;
            }
            ListNode L = new ListNode(sum);
            p.next = L;
            p = p.next;
        }
        if(carry>0){
            ListNode L = new ListNode(carry);
            p.next = L;
        }
        return fake.next;
    }
    public static void main(String [] args){
        AddTwoNumbers obj = new AddTwoNumbers();

    }
}
