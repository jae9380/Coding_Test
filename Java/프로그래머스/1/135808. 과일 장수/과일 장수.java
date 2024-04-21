import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0, count = score.length/m;
        Arrays.sort(score);
        for (int i = 0; i < score.length / 2; i++) {
            int temp = score[i];
            score[i] = score[score.length - 1 - i];
            score[score.length - 1 - i] = temp;
        }
        int i=m-1;
        while(count>0) {
            answer += (score[i]*m);
            i+=m;
            count--;
        }
        return answer;
    }
}