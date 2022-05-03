package Neetcode.Trees;

import java.util.ArrayList;
import java.util.List;

public class KthSmallestElement {
    public static List<Integer> inorder;
    public static int kthSmallestElement(TreeNode root, int k){
        if(root == null){
            return 0;
        }
        inorder = new ArrayList<>();
        inorderTraversal(root);

        return inorder.get(k-1);
    }
    public static void inorderTraversal(TreeNode root){
        if(root == null){
            return;
        }

        inorderTraversal(root.left);
        inorder.add(root.val);
        inorderTraversal(root.right);
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);

        System.out.println("Kth Smallest Element: "+kthSmallestElement(root, 1));
    }
}
