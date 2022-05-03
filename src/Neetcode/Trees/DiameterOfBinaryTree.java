package Neetcode.Trees;

public class DiameterOfBinaryTree {
   static int diameter;
    public static int diameterOfBinaryTree(TreeNode root){
      diameter = 0;
      maxDepth(root);
      return diameter;
    }
    public static int maxDepth(TreeNode root){
        if(root == null){
            return 0;
        }

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        diameter = Math.max(leftDepth+rightDepth, diameter);
        return Math.max(leftDepth, rightDepth)+1;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(7);

        System.out.println(diameterOfBinaryTree(root));
    }
}
