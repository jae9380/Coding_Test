class Solution {
    public int solution(int num) {
        int answer = num == 1 ? 0 : func((long)num,0);
        return answer;
    }
    
    public static int func(long num, int count) {
        if (count == 500 && num != 1) return -1;
        count++;
        if(num%2==0) {
            num = num/2;
        }else {
            num = num*3+1;
        }
        if (num ==1) return count;

        return func(num,count);
    }
}