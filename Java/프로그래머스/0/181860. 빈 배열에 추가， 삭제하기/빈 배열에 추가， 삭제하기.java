import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> arrList = new ArrayList<>();

        for (int i = 0; i < flag.length ; i++) {
            for (int j = 0; j < arr[i] ; j++) {
                if (flag[i]) {
                    arrList.add(arr[i]);
                    arrList.add(arr[i]);
                } else {
                    arrList.remove(arrList.size()-1);
                }
            }
        }

        int[] answer = arrList.stream()
                .mapToInt(i -> i)
                .toArray();
        return answer;
    }
}