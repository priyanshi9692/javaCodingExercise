package Neetcode.Trees;

public class SameTree {
    public static boolean sameTrees(TreeNode p, TreeNode q){
        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null){
            return false;
        }

        if(p.val!= q.val ){
            return false;
        }

        return sameTrees(p.left, q.left) && sameTrees(p.right, q.right);
    }
    public static void main(String[] args){
        TreeNode p = new TreeNode(2);
        p.right = new TreeNode(3);
        p.left = new TreeNode(1);

        TreeNode q = new TreeNode(2);
        q.right = new TreeNode(3);
        q.left = new TreeNode(1);

        System.out.println("Same Trees: "+ sameTrees(p, q));
    }
}
