package 二叉树._297二叉树的序列化与反序列化;

import java.util.LinkedList;

/**
 * 功能描述：
 *
 * @author yy
 * @version 1.0
 * @date 2022/8/7 0:03
 */
public class Solution {


    StringBuilder stringBuilder = new StringBuilder();
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        serializeTree(root);
        return stringBuilder.toString();
    }

    private void serializeTree(TreeNode root) {
        if (root == null) {
            stringBuilder.append('#').append(",");
            return;
        }
        stringBuilder.append(root.val).append(',');
        serializeTree(root.left);
        serializeTree(root.right);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] split = data.split(",");
        LinkedList<String> dataList = new LinkedList<>();
        for (String s : split) {
            dataList.add(s);
        }
        return deserializeTree(dataList);
    }

    private TreeNode deserializeTree(LinkedList<String> data) {
        if (data == null || data.size() == 0) {
            return null;
        }
        String s = data.removeFirst();
        if ("#".equals(s)) {
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(s));
        root.left = deserializeTree(data);
        root.right = deserializeTree(data);
        return root;
    }

}
