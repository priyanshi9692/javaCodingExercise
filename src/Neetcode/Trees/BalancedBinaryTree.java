package Neetcode.Trees;

public class BalancedBinaryTree {
    public static boolean balancedBinaryTree(TreeNode root){
        if(root == null){
            return true;
        }
        int leftH = getHeight(root.left);
        int rightH = getHeight(root.right);

        if(Math.abs(rightH-leftH)>1){
            return false;
        }
        return true;
    }

    public static int getHeight(TreeNode root){
        if(root == null){
            return 0;
        }

        return Math.max(getHeight(root.left), getHeight(root.right))+1;
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println("Balanced Binary Tree: "+balancedBinaryTree(root));
    }
}
