package Neetcode.Trees;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SerializeAndDeserializeBT {
    public static String serialize(TreeNode root){
        return reserialize(root, "");
    }
    public static String reserialize(TreeNode root, String str){
        if(root == null){
            str+= null;
        }else{
            str += str.valueOf(root.val)+" ";
            str = reserialize(root.left, str);
            str = reserialize(root.right, str);
        }
        return str;
    }

    public static TreeNode deserialization(String data){
        String[] data_array = data.split(",");
        List<String> data_list = new LinkedList<String>(Arrays.asList(data_array));
        return rdeserialize(data_list);
    }
    public static TreeNode rdeserialize(List<String> l) {
        // Recursive deserialization.
        if (l.get(0).equals("null")) {
            l.remove(0);
            return null;
        }

        TreeNode root = new TreeNode(Integer.valueOf(l.get(0)));
        l.remove(0);
        root.left = rdeserialize(l);
        root.right = rdeserialize(l);

        return root;
    }

}
