package Neetcode.Trees;

public class BinaryTreeMaxPathSum {
    public static int maxSum = Integer.MIN_VALUE;
    public static int maximumPathSum(TreeNode root){
        calculateSum(root);
        return maxSum;
    }
    public static int calculateSum(TreeNode root){
        if(root == null){
            return 0;
        }

        int left = Math.max(calculateSum(root.left), 0);
        int right = Math.max(calculateSum(root.right), 0);
        int currentSum = root.val+left+right;

        maxSum = Math.max(maxSum, currentSum);
        return root.val+Math.max(left, right);
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);

        System.out.println("Maximum Path sum: "+ maximumPathSum(root));
    }
}
