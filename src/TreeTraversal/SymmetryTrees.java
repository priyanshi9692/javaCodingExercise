package TreeTraversal;
/*
101. Symmetric Tree
Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3


But the following [1,2,2,null,3,null,3] is not:

    1
   / \
  2   2
   \   \
   3    3
*/

import apple.laf.JRSUIUtils;

public class SymmetryTrees {
    public static class TreeNode {
    int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
  }
  public boolean isSymmetry(TreeNode root){
        return isMirror(root, root);
  }
  public boolean isMirror(TreeNode t1, TreeNode t2){
        if(t1==null && t2==null){
            return true;
        }
        if(t1== null || t2 == null){
            return false;
        }
        return (t1.val == t2.val) && isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);
  }
  public static void main(String[] args){
        SymmetryTrees obj = new SymmetryTrees();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);
        System.out.println(obj.isSymmetry(root));
  }
}
