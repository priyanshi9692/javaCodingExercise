package LinkedList;

public class SimpleLinkedList {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    public void push(int data){
        Node new_node=new Node(data);
        new_node.next=head;
        head=new_node;
    }
    public void insertValue(Node prev_node, int data){
        if(prev_node==null){
            System.out.println("Prev_Node doesn't exists");
            return;
        }
        Node new_node=new Node(data);
        new_node.next=prev_node.next;
        prev_node.next=new_node;
    }
    public void append(int data){
        Node new_node= new Node(data);
        if(head==null){
            head =new Node(data);
            return;
        }
        new_node.next=null;
        Node last=head;
        while(last.next!=null){
            last=last.next;
        }
        last.next=new_node;
        return;
    }
    public void printList() {
        Node n=head;
        while(n!=null){
            System.out.print(n.data);
            System.out.print("->");
            n=n.next;
        }
    }



    public static void main(String [] args){
        SimpleLinkedList linkedList=new SimpleLinkedList();
        linkedList.head=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);
        Node fourth=new Node(4);
        linkedList.head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=null;
        linkedList.push(5);
        linkedList.insertValue(linkedList.head, 7);
        linkedList.append(10);
        linkedList.printList();
    }


}
