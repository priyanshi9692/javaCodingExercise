package LinkedList;

import java.io.*;

public class LinkedList {
    Node head;
    static class Node {
        int val;
        Node next;

        Node(int value) {
            val = value;
            next = null;
        }
    }
    public static LinkedList insertElements(LinkedList list, int value){

        Node new_node = new Node(value);
        new_node.next = null;

        if (list.head == null) {
            list.head = new_node;
        }
        else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            last.next = new_node;
        }

        return list;
    }
    public static void printList(LinkedList list)
    {
        Node currNode = list.head;

        System.out.print("LinkedList: ");

        while (currNode != null) {

            System.out.print(currNode.val + " ");

            // Go to next node
            currNode = currNode.next;
        }
    }
    public static void main(String[] args)
    {
        /* Start with the empty list. */
        LinkedList list = new LinkedList();

        //
        // ******INSERTION******
        //

        // Insert the values
        list = insertElements(list, 1);
        list = insertElements(list, 2);
        list = insertElements(list, 3);
        list = insertElements(list, 4);
        list = insertElements(list, 5);
        list = insertElements(list, 6);
        list = insertElements(list, 7);
        list = insertElements(list, 8);

        // Print the LinkedList
        printList(list);
    }


}

