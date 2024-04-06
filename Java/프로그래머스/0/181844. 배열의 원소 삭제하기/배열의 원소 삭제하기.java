import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> filter = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toList());

        for (int i : delete_list) {
            for (int j : arr) {
                if (i==j) {
                    filter.remove(Integer.valueOf(j));
                    break;
                }
            }
        }

        int[] answer = filter.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}