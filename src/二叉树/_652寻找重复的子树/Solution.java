package 二叉树._652寻找重复的子树;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * 功能描述：
 *
 * @author yy
 * @version 1.0
 * @date 2022/8/7 0:27
 */
public class Solution {

    StringBuilder stringBuilder = new StringBuilder();
    List<TreeNode> result = new ArrayList<>();
    HashMap<String, TreeNode> map = new HashMap<>();
    HashMap<String, String> addMap = new HashMap();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        if (root == null) {
            return result;
        }
        traverse(root);
        return result;
    }

    private void traverse(TreeNode root) {
        if (root == null) {
            return;
        }
        serilizable(root);
        String s = stringBuilder.toString();
        if (map.containsKey(s)) {
            if(!addMap.containsKey(s)) {
                result.add(map.get(s));
                addMap.put(s, s);
            }

        } else {
            map.put(s, root);
        }
        stringBuilder.delete(0, s.length());
        traverse(root.left);
        traverse(root.right);
    }

    private void serilizable(TreeNode root) {
        if (root == null) {
            stringBuilder.append("#").append(",");
            return;
        }
        stringBuilder.append(root.val).append(",");
        serilizable(root.left);
        serilizable(root.right);
    }
}
