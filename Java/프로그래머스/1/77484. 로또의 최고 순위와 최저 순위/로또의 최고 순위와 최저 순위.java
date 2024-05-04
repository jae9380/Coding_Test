class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int count =0, miss=0;
        for(int i=0;i<6;i++){
            if(lottos[i]==0) {
                miss++;
                continue;
            }else{
                for(int j=0;j<6;j++) {
                   if(lottos[i]==win_nums[j]) count++;
                }   
            }
        }
        if(miss == 0) {
            answer[0] = count<2 ? 6 : 7-count;
            answer[1] = answer[0];
        }else{
            answer[0] = 7-count-miss;
            answer[1] = count<2 ? 6 : 7-count;
        }

        return answer;
    }
}