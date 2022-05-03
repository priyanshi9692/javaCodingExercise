package Neetcode.Trees;

public class ConstructTreePreorderAndInorder {
    public static TreeNode buildTree(int[] preorder, int[] inorder){
        return constructTree(preorder, inorder, 0, inorder.length-1, 0);
    }

    public static TreeNode constructTree(int[] preorder, int[] inorder, int start, int end, int index){
        if(start>end){
            return null;
        }
        TreeNode root = new TreeNode(preorder[index]);

        int inStartIndex = start;
        while(preorder[index]!= inorder[inStartIndex]){
            inStartIndex++;
        }
        root.left = constructTree(preorder, inorder, start, inStartIndex-1, index+1);
        root.right = constructTree(preorder,inorder, inStartIndex+1, end, index+inStartIndex-start+1);
        return root;
    }
    public static void main(String[] args){
        buildTree(new int[]{3,9,20,15,7}, new int[]{9,3,15,20,7});
    }
}
