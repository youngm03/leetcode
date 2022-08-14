package 回溯._78子集;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 功能描述：
 *
 * @author yy
 * @version 1.0
 * @date 2022/7/29 22:26
 */
public class Solution {
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> track = new LinkedList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backTrack(nums, 0);
        return result;
    }

    private void backTrack(int[] nums, int index) {
        result.add(new LinkedList(track));
        for (int i = index; i < nums.length; i++) {
            track.add(nums[i]);
            backTrack(nums, i + 1);
            track.removeLast();
        }
    }
}
