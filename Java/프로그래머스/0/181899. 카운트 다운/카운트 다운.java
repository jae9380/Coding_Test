class Solution {
    public int[] solution(int start, int end_num) {
        int[] answer = new int [start - end_num + 1];
        int a = 0;
        while(start >= end_num) {
            answer[a] = start;
            start--;
            a++;
        }
        return answer;
    }
}