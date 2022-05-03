package GooglePhoneScreen.Trees;

public class BinaryTreeMaximumPathSum {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(){}
        TreeNode(int val){
            this.val = val;
        }
    }
    public static int maxSum = Integer.MIN_VALUE;
    public static int maximumPathSum(TreeNode root){
        calculateSum(root);
        return maxSum;
    }

    public static int calculateSum(TreeNode root){
        if(root == null){
            return 0;
        }

        // Calculate Left tree values
        int left = Math.max(calculateSum(root.left),0);

        // Calculate right tree values

        int right = Math.max(calculateSum(root.right),0);

        int currentSum = left+right+root.val;

        maxSum = Math.max(maxSum, currentSum);

        return root.val+Math.max(left, right);
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println("Maximum Path Sum: "+ maximumPathSum(root));
    }
}
