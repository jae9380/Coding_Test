import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> arrList = new ArrayList<>();

        for (int i : arr) {
            for (int j = 0; j < i; j++) {
                arrList.add(i);
            }
        }

        int[] answer = arrList.stream()
                .mapToInt(i -> i)
                .toArray();
        return answer;
    }
}