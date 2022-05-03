package TreeTraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
144. Binary Tree Preorder Traversal
Given the root of a binary tree, return the preorder traversal of its nodes' values.

 Example 1:


Input: root = [1,null,2,3]
Output: [1,2,3]

The key to solve this problem is using a stack to store left and right children,
and push right child first so that it is processed after the left child.
 */
public class BinaryTreePreorderTraversal {
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
    public List<Integer> preOrderTraversal(TreeNode root){
        List<Integer> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            result.add(node.val);
            if(node.right!= null){
                stack.push(node.right);
            }
            if(node.left!= null){
                stack.push(node.left);
            }
        }

        return result;
        }
        public static void main(String[] args){
        BinaryTreePreorderTraversal obj = new BinaryTreePreorderTraversal();
        TreeNode root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        System.out.println(obj.preOrderTraversal(root));

        }
}
