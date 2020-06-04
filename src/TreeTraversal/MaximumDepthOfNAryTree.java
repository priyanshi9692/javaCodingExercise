package TreeTraversal;
/*
559. Maximum Depth of N-ary Tree
Given a n-ary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from
the root node down to the farthest leaf node.
Nary-Tree input serialization is represented in their level order traversal,
each group of children is separated by the null value (See examples).
Example 1:
Input: root = [1,null,3,2,4,null,5,6]
Output: 3
 */

import java.util.*;

public class MaximumDepthOfNAryTree {
    static class  Node {
        public int val;
        public List<Node> children = new ArrayList<>();



        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
    int max= 0;
    public int maxDepth(Node root){
        if(root == null){
            return 0;
        }
        helper(root, 1);
        return max;
    }
    public void helper(Node node, int height){
        for(int i = 0; i<node.children.size(); i++){
            helper(node.children.get(i), height+1);
        }
        max = (max>height)? max: height;
    }
    public static void main(String[] args){
        MaximumDepthOfNAryTree obj = new MaximumDepthOfNAryTree();
        Node root = new Node(1);
        root.children.add(new Node(2));
        root.children.add(new Node(3));
        root.children.add(new Node(5));
        root.children.get(0).children.add(new Node(4));

        System.out.println(obj.maxDepth(root));

    }

}
