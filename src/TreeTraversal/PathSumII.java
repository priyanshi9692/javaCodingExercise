package TreeTraversal;

import java.util.ArrayList;
import java.util.List;

/*
113. Path Sum II
Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.

Note: A leaf is a node with no children.

Example:

Given the below binary tree and sum = 22,

      5
     / \
    4   8
   /   / \
  11  13  4
 /  \    / \
7    2  5   1
Return:

[
   [5,4,11,2],
   [5,8,4,5]
]
 */
public class PathSumII {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public List<List<Integer>> pathSum(TreeNode root, int sum){
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        List<Integer> list = new ArrayList<>();
        list.add(root.val);
        depthFirstSearch(root, sum-root.val, result, list);
        return result;
    }
    public void depthFirstSearch(TreeNode root, int sum, List<List<Integer>> result, List<Integer> list){
        if(root.left == null && root.right == null && sum ==0){
            List<Integer> temp = new ArrayList<>();
            temp.addAll(list);
            result.add(temp);
        }
        if(root.left!= null){
            list.add(root.left.val);
            depthFirstSearch(root.left, sum-root.left.val, result, list);
            list.remove(list.size()-1);
        }
        if(root.right!= null){
            list.add(root.right.val);
            depthFirstSearch(root.right, sum-root.right.val, result, list);
            list.remove(list.size()-1);
        }
    }
}
