import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {
            if (!list.isEmpty()) {
                if (list.get(list.size()-1) != arr[i]) {
                    list.add(arr[i]);
                }else {
                    list.remove(list.size()-1);
                }

            }else {
                list.add(arr[i]);
            }
        }
        
        int[] answer = list.isEmpty() ? new int[]{-1} : list.stream()
                .mapToInt(i->i)
                .toArray();
        
        return answer;
    }
}