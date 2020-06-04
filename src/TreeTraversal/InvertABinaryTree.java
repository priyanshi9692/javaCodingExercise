package TreeTraversal;
/*
226. Invert a Binary Tree.
Invert a binary tree.

Example:

Input:

     4
   /   \
  2     7
 / \   / \
1   3 6   9
Output:

     4
   /   \
  7     2
 / \   / \
9   6 3   1
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InvertABinaryTree {
    public static class TreeNode {
        int val;
        TreeNode left;
      TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left,TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public TreeNode invertTree(TreeNode root){
        if(root == null){
            return null;
        }
        TreeNode right = invertTree(root.right);
        TreeNode left = invertTree(root.left);
        root.left = right;
        root.right = left;

        return root;
    }
    public List<Integer> inorderT(TreeNode root){
        if(root == null){
            return null;
        }
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> result = new ArrayList<>();
        TreeNode current = root;
        while(current!= null || stack.isEmpty()){
            while(current!=null){
                stack.push(root);
                current = current.left;
            }
            current = stack.pop();
            result.add(current.val);
            current = current.right;

        }
        return result;
    }
    public static void main(String[] args){
        InvertABinaryTree obj = new InvertABinaryTree();
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left = new TreeNode(3);
        obj.invertTree(root);
    }
}
