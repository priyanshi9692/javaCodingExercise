package TreeTraversal;
/*
124. Binary Tree Maximum Path Sum
Given the root of a binary tree, return the maximum path sum.

For this problem, a path is defined as any node sequence from some starting node to any node in the tree
along the parent-child connections. The path must contain at least one node and does not need to go through the root.

Example 1:

Input: root = [1,2,3]
Output: 6

 */
public class MaximumPathSum {
    public static class TreeNode{
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
    public int maximumPathSum(TreeNode root){
        int [] max = new int[1];
        max[0] = Integer.MIN_VALUE;
        calculateSum(root, max);
        return max[0];
    }
    public int calculateSum(TreeNode root, int[] max){
        if(root == null){
            return 0;
        }
        int left = calculateSum(root.left, max);
        int right = calculateSum(root.right, max);
        int current = Math.max(root.val, Math.max(root.val+left, root.val+right));
        max[0] = Math.max(max[0], Math.max(current, left+root.val+right) );
        return current;
    }
    public static void main(String[] args){
        MaximumPathSum obj = new MaximumPathSum();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        System.out.println(obj.maximumPathSum(root));

    }
}
