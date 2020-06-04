package TreeTraversal;
/*
Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path
from the root node down to the farthest leaf node.

Note: A leaf is a node with no children.

Example:

Given binary tree [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
return its depth = 3.
 */

import apple.laf.JRSUIUtils;

public class MaximumDepthOfBinaryTree {
    public static class TreeNode {
    int val;
    TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
 public int maximumDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        int lDepth = maximumDepth(root.left);
        int rDepth = maximumDepth(root.right);
        return Math.max(lDepth, rDepth)+1;
 }
 public static void main(String [] args){
        MaximumDepthOfBinaryTree obj = new MaximumDepthOfBinaryTree();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.right= new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.left.right = new TreeNode(6);
        root.right.right = new TreeNode(7);
        System.out.println(obj.maximumDepth(root));
 }
}
