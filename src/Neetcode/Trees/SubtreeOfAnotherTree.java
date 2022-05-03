package Neetcode.Trees;

public class SubtreeOfAnotherTree {
    public static boolean subtreeOfAnotherTree(TreeNode root, TreeNode subtree){
        return traverse(root, subtree);
    }
    public static boolean traverse(TreeNode root, TreeNode subtree){
        return root!= null && (sameTree(root, subtree) || traverse(root.left, subtree) || traverse(root.right, subtree));
    }
    public static boolean sameTree(TreeNode root, TreeNode subtree){
        if(root == null && subtree == null){
            return true;
        }

        if(root == null || subtree == null){
            return false;
        }

        if(root.val!= subtree.val){
            return false;
        }

        return sameTree(root.left, subtree.left) && sameTree(root.right, subtree.right);
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(2);
        root.right = new TreeNode(5);

        TreeNode subTree = new TreeNode(4);
        subTree.right = new TreeNode(2);
        subTree.left = new TreeNode(1);

        System.out.println(" SubTree of Another tree: "+ subtreeOfAnotherTree(root, subTree));
    }
}
