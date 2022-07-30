package 回溯._47全排列II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 功能描述：
 *
 * @author yy
 * @version 1.0
 * @date 2022/7/30 15:45
 */
public class Solution {

    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> track = new LinkedList<>();
    boolean[] used;
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        used = new boolean[nums.length];
        backTrack(nums);
        return result;
    }

    private void backTrack(int[] nums) {
        if (track.size() == nums.length) {
            result.add(new ArrayList<>(track));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                continue;
            }
            track.add(nums[i]);
            used[i] = true;
            backTrack(nums);
            track.removeLast();
            used[i] = false;
        }
    }

}
