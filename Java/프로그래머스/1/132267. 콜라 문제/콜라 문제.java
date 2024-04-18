class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while (n>=a) {
            int give = n/a;
            int take = b*give;
            answer += take;
            n = n-(give*a) + take;
        }
        return answer;
    }
}