package Neetcode.Trees;

public class CountGoodNodesIntheBinaryTree {
    public static int goodNodes = 0;
    public static int countGoodNodes(TreeNode root){
        countGoodNodesRecursion(root, Integer.MIN_VALUE);
        return goodNodes;
    }

    public static void countGoodNodesRecursion(TreeNode root, int maxSoFar){
        // Process root
        if(maxSoFar<= root.val){
            goodNodes++;
        }
        // Left Children

        if(root.left!= null){
            countGoodNodesRecursion(root.left, Math.max(root.val, maxSoFar));
        }

        // Right Children
        if(root.right!= null){
            countGoodNodesRecursion(root.right, Math.max(root.val, maxSoFar));
        }
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.left.left = new TreeNode(3);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(5);

        System.out.println("Good Nodes: "+ countGoodNodes(root));
    }
}
