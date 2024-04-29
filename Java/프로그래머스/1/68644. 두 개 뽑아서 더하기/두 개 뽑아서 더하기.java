import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> result =new ArrayList<>();
        for(int i=0;i<numbers.length-1;i++) {
            for(int j=i+1;j<numbers.length;j++) {
                if (!result.contains(numbers[i]+numbers[j])){
                    result.add(numbers[i]+numbers[j]);
                }
            }
        }
        int[] answer = result.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);
        return answer;
    }
}