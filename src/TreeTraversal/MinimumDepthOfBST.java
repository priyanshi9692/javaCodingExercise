package TreeTraversal;

import LinkedList.LinkedList;

/*
111. Minimum Depth of Binary Tree
Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

Note: A leaf is a node with no children.



Example 1:

Input: root = [3,9,20,null,null,15,7]
Output: 2

 */
public class MinimumDepthOfBST {
    public class TreeNode {
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
    public static int minimumDepthBST(TreeNode root){
        if(root == null){
            return 0;
        }
//       LinkedList<TreeNode> nodes = new LinkedList<TreeNode>();
        LinkedList<Integer> count = new LinkedList<Integer>();
        return 0;
    }
}
