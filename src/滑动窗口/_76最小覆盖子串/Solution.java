package 滑动窗口._76最小覆盖子串;

import java.util.HashMap;

/**
 * 功能描述：
 *
 * @author yy
 * @version 1.0
 * @date 2022/7/27 22:42
 */

public class Solution {

    public String minWindow(String s, String t) {
        int left = 0, right = 0, valid = 0;
        HashMap<Character, Integer> window = new HashMap<>();
        HashMap<Character, Integer> need = new HashMap<>();
        int start = 0;
        int len = Integer.MAX_VALUE;
        for (int i = 0; i < t.length(); i++) {
            need.put(t.charAt(i), need.getOrDefault(need.get(t.charAt(i)), 0) + 1);
        }
        while (right < s.length()) {
            char c = s.charAt(right);
            right++;
            if (need.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (window.get(c).equals(need.get(c))) {
                    valid++;
                }
            }
            while (valid == need.size()) {
//                更新最小长度
                if (right - left < len) {
                    start = left;
                    len = right - left;
                }
                char c1 = s.charAt(left);
                left++;
                if (need.containsKey(c1)) {
                    if (window.get(c1).equals(need.get(c1))) {
                        valid--;
                    }
                    window.put(c1, window.get(c1) - 1);
                }
            }
        }
        return len == Integer.MAX_VALUE ? "" : s.substring(start, start + len);
    }

}





