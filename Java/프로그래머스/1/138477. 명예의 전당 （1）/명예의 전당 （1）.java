import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        return func(k,score);
    }
    private static int[] func(int k, int[] score) {
        int[] result = new int[score.length];
        ArrayList<Integer> list = new ArrayList<>();
        result[0] = score[0];
        list.add(score[0]);
        for(int i=1;i<score.length;i++) {
            list.add(score[i]);
            Collections.sort(list, Collections.reverseOrder());
            result[i] = list.size() < k ? list.get(list.size()-1) : list.get(k-1);
        }
        return result;
    }
}