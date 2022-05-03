package Neetcode.Trees;

public class ValidateBinarySearchTree {
    public static boolean validateBST(TreeNode root){
        return validateBST(root, null, null);
    }
    public static boolean validateBST(TreeNode root, Integer low, Integer high){
        if(root == null){
            return true;
        }

        if((low!= null && root.val<= low) ||(high!= null && root.val>=high)){
            return false;
        }

        return validateBST(root.left, low, root.val) && validateBST(root.right, root.val, high);
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        System.out.println("Is BST: "+ validateBST(root));
    }
}
