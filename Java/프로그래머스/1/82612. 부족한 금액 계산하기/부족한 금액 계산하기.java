class Solution {
    public long solution(int price, int money, int count) {
        long answer = func(price, money, count);

        return answer;
    }
    
    private static long func(int price, int money, int count) {
        long result =0;
        for (int i = 1; i <= count ; i++) {
            result += i*price;
        }
        result = result< money ? 0 : result-money;
        
        return result;
    }
}