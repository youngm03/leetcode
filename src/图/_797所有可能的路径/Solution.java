package 图._797所有可能的路径;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 功能描述：
 *
 * @author yy
 * @version 1.0
 * @date 2022/8/8 21:20
 */
public class Solution {

    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        traverse(graph, 0, path);
        return result;
    }

    private void traverse(int[][] graph, int value, LinkedList<Integer> path) {
        path.add(value);
        if (value == graph.length - 1) {
            result.add(new LinkedList<>(path));
            path.removeLast();
            return;
        }
        for (int i : graph[value]) {
            traverse(graph, i, path);
        }
        path.removeLast();
    }


}
