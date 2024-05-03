import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] A = {1,2,3,4,5}, B = {2,1,2,3,2,4,2,5}, C = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] score = new int[3];
        for(int i=0;i<answers.length;i++){
            if(answers[i] == A[i%5]) score[0]++;
            if(answers[i] == B[i%8]) score[1]++;
            if(answers[i] == C[i%10]) score[2]++;
        }
        int max = getMax(score);
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i=0; i<score.length; i++){
            if(max==score[i]) result.add(i+1);
        }
        int[] answer = result.stream().mapToInt(i->i).toArray();
        return answer;
    }
    private static int getMax(int[] score) {
        int max = 0;
        for(int num : score){
            if(max<num) max = num;
        }
        return max;
    }
}