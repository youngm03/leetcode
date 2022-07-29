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

    public List<List<Integer>> subsets(int[] nums) {
        LinkedList<Integer> track = new LinkedList<>();
        backTrack(nums, track, 0);
        return result;
    }

    private void backTrack(int[] nums, LinkedList<Integer> track, int index) {
        result.add(new ArrayList<>(track));
        for (int i = index; i < nums.length; i++) {
            track.add(nums[i]);
            backTrack(nums, track, i + 1);
            track.removeLast();
        }
    }
}
