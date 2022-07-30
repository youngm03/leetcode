package 回溯._77组合;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 功能描述：
 *
 * @author yy
 * @version 1.0
 * @date 2022/7/29 22:25
 */
public class Solution {


    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> track = new LinkedList<>();
    public List<List<Integer>> combine(int n, int k) {

        backTrack(n, k, 1);
        return result;
    }

    private void backTrack(int n, int k, int index) {
        if (track.size() == k) {
            result.add(new ArrayList<>(track));
            return;
        }
        for (int i = index; i <= n; i++) {
            track.add(i);
            backTrack(n, k, i + 1);
            track.removeLast();
        }
    }
}
