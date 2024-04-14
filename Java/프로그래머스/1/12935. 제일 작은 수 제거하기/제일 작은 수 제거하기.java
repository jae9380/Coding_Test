import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int[] solution(int[] arr) {
        return func(arr);
    }
    
    private static int[] func(int[] arr) {
        if(arr.length == 1) {
            int[] answer = {-1};
            return answer;
        }else{
            List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
            int min = list.stream().mapToInt(v -> v).min().orElse(0);
            list.remove(new Integer(min));
            int[] answer = list.stream().mapToInt(i -> i).toArray();
            return answer;
        }
        
    }
}