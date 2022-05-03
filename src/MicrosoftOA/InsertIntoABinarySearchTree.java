package MicrosoftOA;

import java.util.ArrayList;
import java.util.List;

public class InsertIntoABinarySearchTree {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){}
        TreeNode(int val){
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static TreeNode insertIntoBST(TreeNode root, int val){
        if(root == null){
            return new TreeNode(val);
        }

        if(val> root.val){
            root.right = insertIntoBST(root.right, val);
        }else{
            root.left = insertIntoBST(root.left, val);
        }
        return root;
    }
    public static List<Integer> inorder(TreeNode root){
        if(root == null){
            return null;
        }
        List<Integer> list = new ArrayList<>();
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
        return list;
    }
    public static void main(String[] args){
        TreeNode tree = new TreeNode(5);
        tree.left = new TreeNode(3);
        tree.right = new TreeNode(7);
        tree.right.left = null;
        tree.right.right = null;
        tree.left.left = new TreeNode(2);
        tree.left.right = new TreeNode(4);
        tree.left.left.left = null;
        tree.left.left.right = null;

        insertIntoBST(tree, 6);
        System.out.println(inorder(tree));
    }
}
