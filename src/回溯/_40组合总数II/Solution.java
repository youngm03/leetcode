package 回溯._40组合总数II;

import java.net.Inet4Address;
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
    int sum = 0;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
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
            if (i > index && nums[i] == nums[i - 1]) {
                continue;
            }
            sum += nums[i];
            track.add(nums[i]);
            backTrack(nums, target, i + 1 );
            sum -= nums[i];
            track.removeLast();
        }
    }

}
