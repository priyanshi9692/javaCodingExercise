package GooglePhoneScreen.Trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class VerticalLevelTraversal {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val = val;
        }
        TreeNode(){}
    }
    public static HashMap<Integer, List<int[]>> map = new HashMap<>();
    public static List<List<Integer>> verticalLevelOrderTraversal(TreeNode root){
        verticalRecursion(root, 0, 0);
        List<List<Integer>> result = new ArrayList<>();

        // Let's process HashMap values

        List<Integer> columns = new ArrayList<>(map.keySet());
        // Sort the columns

        Collections.sort(columns);

        for(int key: columns){
            List<int[]> nodes = map.get(key);

            // sort nodes according to their X- Co-ordinate

            Collections.sort(nodes, (a,b)->Integer.compare(a[1],b[1]));
            List<Integer> eachCol = new ArrayList<>();
            for(int[] node: nodes){
                eachCol.add(node[0]);
            }
            result.add(eachCol);
        }
        return result;
    }

    public static void verticalRecursion(TreeNode root, int column, int level){
        if(root == null){
            return;
        }
        // process root
        List<int[]> nodes = map.get(column);
        if(nodes == null){
            nodes = new ArrayList<>();
            nodes.add(new int[]{root.val, level+1});

            map.put(column, nodes);
        }else{
            nodes.add(new int[]{root.val, level+1});
        }

        // Let's go to the Left Tree
        verticalRecursion(root.left, column-1, level+1);

        // Let's go to the right tree
        verticalRecursion(root.right, column+1, level+1);
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println("Vertical Order Traversal Of Binary Tree: "+verticalLevelOrderTraversal(root));
    }
}
