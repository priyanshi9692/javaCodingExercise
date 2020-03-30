package LinkedList;

public class RemoveDuplicates {
    ListNode head;
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val=x;
        }
    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current=head;
        while(current!=null && current.next!=null){
            if(current.next.val==current.val){
                current.next=current.next.next;
            }
            else{
                current=current.next;
            }
        }
        return head;
    }
    public void push(int data){
        ListNode new_node=new ListNode(data);
        new_node.next=head;
        head=new_node;
    }
    public void printList() {
        ListNode n = head;
        while (n != null) {
            System.out.print(n.val);
            System.out.print("->");
            n = n.next;
        }
    }
    public static void main(String [] args){
        RemoveDuplicates obj= new RemoveDuplicates();
        obj.head= new ListNode(3);
        ListNode second=new ListNode(3);
      ListNode third=new ListNode(3);
      ListNode fourth=new ListNode(3);
      obj.head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=null;
        obj.deleteDuplicates(second);
        obj.printList();

    }
}
