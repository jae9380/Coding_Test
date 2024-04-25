import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0, i=0, sum=0;
        Arrays.sort(d);
        while(sum<=budget && i<d.length) {
            sum+=d[i];
            if (sum <= budget) {
                answer++;
            }
            i++;
        }
        return answer;
    }
}