class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        while(true) {
            a=a/2+a%2;
            b=b/2+b%2;
            answer++;
            if(a==b) {
                break;
            }
        }
        return answer;
    }
}