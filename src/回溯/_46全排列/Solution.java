package 回溯._46全排列;

import sun.applet.Main;

import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 功能描述：
 *
 * @author yy
 * @version 1.0
 * @date 2022/7/29 22:02
 */
public class Solution {

    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> track = new LinkedList<>();
    boolean[] used;
    public List<List<Integer>> permute(int[] nums) {
        used = new boolean[nums.length];
        backTrack(nums);
        return result;
    }

    private void backTrack(int[] nums) {
        if (track.size() == nums.length) {
            result.add(new ArrayList<>(track));
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
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
