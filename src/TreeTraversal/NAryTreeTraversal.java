package TreeTraversal;
/*
590. N-ary Tree Postorder Traversal
Given an n-ary tree, return the postorder traversal of its nodes' values.

Nary-Tree input serialization is represented in their level order traversal,
each group of children is separated by the null value (See examples).
Input: root = [1,null,3,2,4,null,5,6]
Output: [5,6,3,2,4,1]

 */
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class NAryTreeTraversal {
    static class Node{
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public List<Integer> postorder(Node root) {
        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Integer> result = new LinkedList<>();
        if(root == null){
            return result;
        }
        stack.add(root);
        while(!stack.isEmpty()){
            Node node = stack.pollLast();
            result.addFirst(node.val);
            for(Node child : node.children){
                stack.add(child);
            }
        }
        return result;
    }
    public List<Integer> preorder(Node root){
        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Integer> result = new LinkedList<>();
        if(root == null){
            return result;
        }
        stack.add(root);
        while(root!=null || !stack.isEmpty()){
            Node node = stack.pollLast();
            result.add(node.val);
            Collections.reverse(node.children);
            for(Node child : node.children){
                stack.add(child);
            }
        }
        return result;
    }
    public static void main(String[] args){
        NAryTreeTraversal obj = new NAryTreeTraversal();
        Node root = new Node(1);
        root.children.add(new Node(3));
        root.children.add(new Node(2));
        root.children.add(new Node(4));

        root.children.get(0).children.add(new Node(5));
        root.children.get(0).children.add(new Node(6));


        System.out.println(obj.postorder(root));
        System.out.println(obj.preorder(root));

    }


}
