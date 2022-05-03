package TreeTraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderTraversal {
    public static class TreeNode {
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
        public List<Integer> inorderTraversal(TreeNode root){
            List<Integer> list = new ArrayList<>();

        if(root == null){
            return list;
        }
        Stack<TreeNode> stack = new Stack<>();
           TreeNode current = root;
           while(current!=null || stack.size()>0){
               while(current!=null){
                   stack.push(current);
                   current = current.left;
               }
               current = stack.pop();
               list.add(current.val);
               current = current.right;
           }
        return list;
        }
        public static void main(String[] args){
        InorderTraversal obj = new InorderTraversal();
            TreeNode root = new TreeNode(1);
            root.left = new TreeNode(2);
            root.right =new TreeNode(3);
            root.left.left = new TreeNode(4);
           root.left.right = new TreeNode(5);
           List<Integer> list = new ArrayList<>();
           list = obj.inorderTraversal(root);
            System.out.println(list.size());
           for(int elem: list){
                //print each element from ArrayList
                System.out.print(elem+", \t");
            }
        }

}
