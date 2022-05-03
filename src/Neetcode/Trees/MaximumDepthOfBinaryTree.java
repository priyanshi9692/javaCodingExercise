package Neetcode.Trees;

public class MaximumDepthOfBinaryTree {
    public static int maximumDepth(TreeNode root){
        if(root == null){
            return 0;
        }

        return 1+Math.max(maximumDepth(root.left), maximumDepth(root.right));
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(7);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        System.out.println(maximumDepth(root));
    }
}
