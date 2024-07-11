class Solution {
    public int solution(int storey) {
        int answer = 0;
        while(storey>0) {
            int x=storey%10;
            storey=storey/10;
            
            if(x==5) {
                if(storey%10 >=5) {
                    answer=answer+(10-x);
                    storey++;
                }else {
                    answer = answer +x;
                }
            }else if(x>5) {
                answer=answer+(10-x);
                storey++;
            }else {
                answer = answer+x;
            }
        }
        return answer;
    }
}