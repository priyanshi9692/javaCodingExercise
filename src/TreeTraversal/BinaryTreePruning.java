package TreeTraversal;
/*
LeetCode 814. Binary Tree Pruning
We are given the head node root of a binary tree, where additionally every node's value is either a 0 or a 1.

Return the same tree where every subtree (of the given tree) not containing a 1 has been removed.

(Recall that the subtree of a node X is X, plus every node that is a descendant of X.)

Example 1:
Input: [1,null,0,0,1]
Output: [1,null,0,null,1]

Explanation:
Only the red nodes satisfy the property "every subtree not containing a 1".
The diagram on the right represents the answer.

 */

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePruning {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public TreeNode binaryTreePruning(TreeNode root){
            if(root == null){
                return root;
            }
            containsOne(root);
            return root;

    }
    public boolean containsOne(TreeNode node){
        if(node == null ){
            return false;
        }
        boolean leftBranch = containsOne(node.left);
        boolean rightBranch = containsOne(node.right);
        if(!leftBranch){
            node.left = null;
        }
        if(!rightBranch){
            node.right = null;
        }
        return node.val == 1 || leftBranch || rightBranch;
    }
//    public List<Integer> inorderTraversal(TreeNode root){
//        Stack<TreeNode> stack = new Stack<>();
//        List<Integer> result = new ArrayList<>();
//        if(root == null){
//            return result;
//        }
//        TreeNode current = root;
//        while(current!= null || stack.isEmpty()){
//            while(current!= null){
//                stack.push(current);
//                current = current.left;
//            }
//            current = stack.pop();
//            result.add(current.val);
//            current = current.right;
//        }
//        return result;
//    }
    public static void main(String [] args){
        BinaryTreePruning obj = new BinaryTreePruning();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(0);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(1);
        TreeNode result = obj.binaryTreePruning(root);
        System.out.println(result);

    }

}
