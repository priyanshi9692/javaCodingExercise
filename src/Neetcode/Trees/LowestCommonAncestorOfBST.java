package Neetcode.Trees;

public class LowestCommonAncestorOfBST {
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        int parent = root.val;

        int pVal = p.val;
        int qVal = q.val;

        if(pVal>parent && qVal>parent){
            return lowestCommonAncestor(root.right, p, q);
        }else if(pVal<parent && qVal<parent){
            return lowestCommonAncestor(root.left, p, q);
        }else{
            return root;
        }
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);

        root.right = new TreeNode(8);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);


        System.out.println("LowestCommonAncestor: "+ lowestCommonAncestor(root, root.left, root.right).val);


    }
}
