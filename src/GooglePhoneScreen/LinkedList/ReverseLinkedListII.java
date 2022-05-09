package GooglePhoneScreen.LinkedList;

public class ReverseLinkedListII {
    public static ListNode reverseList(ListNode head, int left, int right){
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;

        for(int i = 0; i<left-1; i++){
            pre =  pre.next;
        }

        ListNode reverseBegin = pre.next;
        ListNode endList = reverseBegin.next;

        for(int i =0; i<right-left; i++){
            reverseBegin.next = endList.next;
            endList.next = pre.next;
            pre.next = endList;
            endList = reverseBegin.next;
        }
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

        ListNode result = reverseList(head, 2, 4);

        while(result!= null){
            System.out.print(result.val+"->");
            result = result.next;
        }
    }
}
