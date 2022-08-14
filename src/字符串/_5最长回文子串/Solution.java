package 字符串._5最长回文子串;

/**
 * 功能描述：
 *
 * @author yy
 * @version 1.0
 * @date 2022/8/13 22:57
 */
public class Solution {

    public String longestPalindrome(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            String s1 = longest(s, i, i);
            String s2 = longest(s, i, i + 1);
            result = s1.length() > result.length() ? s1 : result;
            result = s2.length() > result.length() ? s2 : result;
        }
        return result;
    }

    private String longest(String s, int left, int right) {
        while (left >= 0 && right < s.length()) {
            if (s.charAt(left) != s.charAt(right)) {
                break;
            }
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}
