package 数组._167两数之和II输入有序数组;

import java.util.HashMap;
import java.util.Map;

/**
 * 功能描述：
 *
 * @author yy
 * @version 1.0
 * @date 2022/8/13 22:44
 */
public class Solution {

    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            map.put(numbers[i], i + 1);
        }
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[0] = i + 1;
                result[1] = map.get(target - numbers[i]);
                break;
            }
        }
        return result;
    }

}
