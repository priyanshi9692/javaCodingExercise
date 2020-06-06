package LinkedList;
/*
21. Merge Two Sorted Lists
Merge two sorted linked lists and return it as a new sorted list.
The new list should be made by splicing together the nodes of the first two lists.
Example:
Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4
*/
public class MergeTwoLinkedLists {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() { }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val,ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
        ListNode temp = new ListNode(0);
        ListNode current = temp;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                current.next = l1;
                l1 = l1.next;
            }else{
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        if(l1!=null){
            current.next = l1;
            l1 = l1.next;
        }
        if(l2!=null){
            current.next = l2;
            l2 = l2.next;
        }
        return temp.next;
    }
    public static void main(String[] args){
        MergeTwoLinkedLists obj = new MergeTwoLinkedLists();
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
        ListNode head1 = new ListNode(1);
        ListNode second1 = new ListNode(2);
        ListNode third1 = new ListNode(3);
        ListNode fourth1 = new ListNode(4);
        ListNode fifth1 = new ListNode(5);
        head1.next = second1;
        second1.next = third1;
        third1.next = fourth1;
        fourth1.next = fifth1;
        fifth1.next = null;
        ListNode result = obj.mergeTwoLists(head,head1 );
        while(result!=null){
            System.out.print(result.val+"\t");
            result = result.next;
        }
    }
}
