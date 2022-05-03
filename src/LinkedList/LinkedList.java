package LinkedList;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class LinkedList<I extends Number> implements Queue<String> {
    Node head;

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<String> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(String s) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends String> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean offer(String s) {
        return false;
    }

    @Override
    public String remove() {
        return null;
    }

    @Override
    public String poll() {
        return null;
    }

    @Override
    public String element() {
        return null;
    }

    @Override
    public String peek() {
        return null;
    }

    static class Node {
        int val;
        Node next;

        Node(int value) {
            val = value;
            next = null;
        }
    }
    public static LinkedList<Number> insertElements(LinkedList<Number> list, int value){

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
    public static void printList(LinkedList<Number> list)
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
        LinkedList<Number> list = new LinkedList<Number>();

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

