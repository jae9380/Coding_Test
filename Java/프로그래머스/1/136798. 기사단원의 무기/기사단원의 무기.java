class Solution {
    public int solution(int number, int limit, int power) {
        return func(number, limit, power);
    }
    private static int func(int number, int limit, int power) {
        int result = 0, count =0;
        for(int i=1;i<=number;i++) {
            for(int j=1;j*j<=i;j++) {
                if(i%j==0) {
                    count++;
                    if(j != i/j) count++;
                }
            }
            result = count>limit ? result + power : result + count;
            count=0;
        }
        return result;
    }
}