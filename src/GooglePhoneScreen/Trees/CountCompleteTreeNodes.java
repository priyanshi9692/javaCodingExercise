package GooglePhoneScreen.Trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountCompleteTreeNodes {
    public static int countCompleteTreeNode(TreeNode root){
        if(root == null){
            return 0;
        }

        return 1+countCompleteTreeNode(root.left)+countCompleteTreeNode(root.right);
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(6);

        System.out.println("Tree nodes count: "+countCompleteTreeNode(root));
    }
}
