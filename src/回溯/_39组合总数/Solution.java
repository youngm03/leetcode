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

    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> track = new LinkedList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backTrack(candidates, target, 0, 0);
        return result;
    }

    private void backTrack(int[] nums, int target, int sum, int index) {
        if (sum == target) {
            result.add(new ArrayList<>(track));
        }
        if (sum > target) {
            return;
        }
        for (int i = index; i < nums.length; i++) {
            sum += nums[i];
            track.add(nums[i]);
            backTrack(nums, target, sum, i);
            track.removeLast();
            sum -= nums[i];
        }

    }

}
