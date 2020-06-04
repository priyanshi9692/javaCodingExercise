package TreeTraversal;
/*
112. Path Sum
Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that
adding up all the values along the path equals the given sum.

Note: A leaf is a node with no children.

Example:

Given the below binary tree and sum = 22,

      5
     / \
    4   8
   /   / \
  11  13  4
 /  \      \
7    2      1
return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.

 */

import apple.laf.JRSUIUtils;

public class PathSumOfABinaryTree {
    public static class TreeNode {
        int val;
   TreeNode left;
     TreeNode right;
    TreeNode(int x) { val = x; }
    }
    public boolean pathSum(TreeNode root, int sum){
        if(root == null ){
            return false;
        }
        if(root.val==sum && (root.left == null && root.right == null)){
            return true;
        }
        return pathSum(root.left, sum-root.val) || pathSum(root.right, sum-root.val);
    }
    public static void main(String[] args){
        PathSumOfABinaryTree obj = new PathSumOfABinaryTree();
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);

        System.out.println(obj.pathSum(root, 22));

    }
}
