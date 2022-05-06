package Visa;

import java.util.HashSet;

public class LinkedListCycle {
    public static boolean linkedListCycle(ListNode head){
        HashSet<ListNode> set = new HashSet<>();

        ListNode traverse = head;

        while(traverse!= null){
            if(set.contains(traverse)){
               return true;
            }
            set.add(traverse);
            traverse = traverse.next;
        }
        return false;
    }

    public static void main(String[] args){
        ListNode head = new ListNode(1);
        ListNode first = new ListNode(2);
        ListNode second = new ListNode(3);


        head.next = first;
        first.next = second;
        second.next = head;

        System.out.println("Is loop: "+ linkedListCycle(head));
    }
}
