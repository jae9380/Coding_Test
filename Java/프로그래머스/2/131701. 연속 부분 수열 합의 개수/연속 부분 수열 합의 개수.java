import java.util.*;
class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i<2; i++) {
            for (int element : elements) {
                list1.add(element);
            }
        }
        for (int i = 0; i < elements.length; i++) {
            for (int j = 1; j <= elements.length; j++) {
                List<Integer> list2 = list1.subList(i, i+j);
                int sum = 0;
                for (int num : list2)
                    sum += num;
                set.add(sum);
            }
        }
        answer = set.size();
        return answer;
    }
}