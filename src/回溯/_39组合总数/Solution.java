package 回溯._39组合总数;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 功能描述：
 *
 * @author yy
 * @version 1.0
 * @date 2022/7/30 14:48
 */
public class Solution {
    int sum = 0;
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> track = new LinkedList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backTrack(candidates, target, 0);
        return result;
    }

    private void backTrack(int[] nums, int target, int index) {
        if (sum == target) {
            result.add(new LinkedList<>(track));
            return;
        }
        if (sum > target) {
            return;
        }
        for (int i = index; i < nums.length; i++) {
            track.add(nums[i]);
            sum += nums[i];
            backTrack(nums, target, i);
            track.removeLast();
            sum -= nums[i];
        }
    }
}
