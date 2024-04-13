import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        Arrays.sort(arr);

        if (arr[arr.length - 1]<divisor) {
            int[] answer = {-1};
            return answer;
        }else if (divisor==1){
            int[] answer = arr.clone();
            return answer;
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int i : arr) {
            if (i%divisor == 0) {
                list.add(i);
            }
        }
        if(list.isEmpty()){
            int[] answer = {-1};
            return answer;
        }
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}