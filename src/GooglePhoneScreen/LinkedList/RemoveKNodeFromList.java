package GooglePhoneScreen.LinkedList;

public class RemoveKNodeFromList {
    public static class ListNode{
        int val;
        ListNode next;

        ListNode(){}

        ListNode(int val){
            this.val = val;
        }
    }

    public static ListNode removeKNodeFromLast(ListNode head, int n){

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        int length = 0;

        ListNode traversalPtr = head;
        while(traversalPtr!= null){
            length++;
            traversalPtr = traversalPtr.next;
        }

        length = length-n;

        traversalPtr = dummy;

        while(length>0){
            traversalPtr = traversalPtr.next;
            length--;
        }
        traversalPtr.next = traversalPtr.next.next;

        return dummy.next;
    }

    public static void main(String[] args){
        ListNode head = new ListNode(1);
        ListNode first = new ListNode(2);
        ListNode second = new ListNode(3);
        ListNode third = new ListNode(4);
        ListNode four = new ListNode(5);
        head.next = first;
        first.next = second;
        second.next = third;
        third.next = four;
        four.next = null;

        ListNode result = removeKNodeFromLast(head, 2);

        while(result!= null){
            System.out.print(result.val+ "\t");
            result = result.next;
        }

    }
}
