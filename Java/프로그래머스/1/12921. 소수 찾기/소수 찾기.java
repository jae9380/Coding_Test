class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean prime = true;
        for(int i=2; i<=n;i++) {
            for(int j=1;j*j<=i;j++) {
                if(j==1) continue;
                if(i%j==0) {
                    prime = false;
                    break;
                }
            }
            answer = prime ? answer+1 : answer;
            prime = true;
        }
        return answer;
    }
}