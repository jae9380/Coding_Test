class Solution {
    public int solution(int left, int right) {
        return func(left,right);
    }
    private static int func(int start, int end) {
        int result = 0;
        int count = 0;
        while(start<=end){
            for (int i =1; i*i<=start; i++) {
                if (start%i==0) {
                    count++;
                    if (start/i != i) count++;
                }
            }
            result = count%2==0 ? result+start : result-start;
            start++;
            count=0;
        }
        return result;
    }
}