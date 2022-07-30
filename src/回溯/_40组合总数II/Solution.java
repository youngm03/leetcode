package 回溯._40组合总数II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 功能描述：
 *
 * @author yy
 * @version 1.0
 * @date 2022/7/30 15:13
 */
public class Solution {

    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> track = new LinkedList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backTrack(candidates, target, 0, 0);
        return result;
    }

    private void backTrack(int[] nums, int target, int index, int sum) {
        if (sum == target) {
            result.add(new ArrayList<>(track));
            return;
        }
        if (sum > target) {
            return;
        }
        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1]) {
                continue;
            }
            track.add(nums[i]);
            sum += nums[i];
            backTrack(nums, target, i + 1, sum);
            track.removeLast();
            sum -= nums[i];
        }
    }

}
