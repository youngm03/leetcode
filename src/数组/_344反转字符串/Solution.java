package 数组._344反转字符串;

/**
 * 功能描述：
 *
 * @author yy
 * @version 1.0
 * @date 2022/7/27 21:04
 */
public class Solution {

    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

}
