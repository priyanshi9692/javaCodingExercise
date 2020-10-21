package TreeTraversal;
/*
Given a binary tree, return the inorder traversal of its nodes' values.
Example:
//Inorder (Left, Root, Right)
Input: [1,null,2,3]
   1
    \
     2
    /
   3

Output: [1,3,2]
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryInorderTraversal {
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
    public List<Integer> inorderTraversal(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        TreeNode current = root;
        while(current!= null || !stack.isEmpty()){
            while (current!=null){
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            result.add(current.val);
            current = current.right;

        }
        return result;
    }
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2){
        if(t1==null){
            return t2;
        }
        if(t2==null){
            return t1;
        }
        t1.val += t2.val;
        t1.left = mergeTrees(t1.left, t2.left );
        t1.right = mergeTrees(t1.right, t2.right);
        return t1;
    }
    public static void main(String[] args){
        BinaryInorderTraversal obj = new BinaryInorderTraversal();
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        TreeNode root1 = new TreeNode(1);
        root1.right = new TreeNode(2);
        root1.right.left = new TreeNode(3);
        System.out.println(obj.inorderTraversal(root));
        TreeNode result = obj.mergeTrees(root, root1);
        System.out.println(obj.inorderTraversal(result));


    }
}
