package 回溯._216组合总数III;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 功能描述：
 *
 * @author yy
 * @version 1.0
 * @date 2022/7/30 14:47
 */
public class Solution {

    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> track = new LinkedList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        backTrack(k, n, 1, 0);
        return result;
    }

    private void backTrack(int k, int n, int index, int sum) {
        if (sum == n && track.size() == k) {
            result.add(new ArrayList<>(track));
            return;
        }
        if (sum > n || track.size() > k) {
            return;
        }
        for (int i = index; i <= 9; i++) {
            track.add(i);
            sum += i;
            backTrack(k, n, i + 1, sum);
            track.removeLast();
            sum -= i;
        }
    }

}
