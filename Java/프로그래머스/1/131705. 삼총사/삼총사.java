class Solution {
    public int solution(int[] number) {
        int answer = 0;
        for(int i=0;i<number.length-2;i++) {
            for(int j=i+1;j<number.length-1;j++) {
                for(int h=j+1;h<number.length;h++){
                    answer = number[i]+number[j]+number[h] == 0 ? answer+1 : answer;
                }
            }
        }
        return answer;
    }
}