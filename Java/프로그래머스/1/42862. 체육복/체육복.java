import java.util.Arrays;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);
        int answer = n-lost.length;
        for(int l=0; l<lost.length; l++) {
            for(int r=0; r<reserve.length; r++) {
                if( lost[l] == reserve[r]) {
                    lost[l] = -1; 
                    reserve[r] = -1;
                    answer++;
                    break;
//                }else if(lost[l] == reserve[r]-1 || lost[l] == reserve[r]+1 ) {
//                    lost[l] = -1;
//                    reserve[r] = -1;
//                    answer++;
//                    break;
                }
            }
        }
// 도난 당한 사람 중 자신이 여벌이 있는 경우 먼저 확인        
        for(int l=0; l<lost.length; l++) {
            for(int r=0; r<reserve.length; r++) {
//                if( lost[l] == reserve[r]) {
//                    lost[l] = -1; 
//                    reserve[r] = -1;
//                    answer++;
//                    break;
//                }else 
                    if(lost[l] == reserve[r]-1 || lost[l] == reserve[r]+1 ) {
                    lost[l] = -1;
                    reserve[r] = -1;
                    answer++;
                    break;
                }
            }
        }        
        
        return answer;
    }
}