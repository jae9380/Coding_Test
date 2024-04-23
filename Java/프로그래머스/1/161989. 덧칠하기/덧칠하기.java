class Solution {
    public int solution(int n, int m, int[] section) {
        return func(n,m,section);
    }
    private static int func(int n, int m, int[] section) {
        int result = 1, count =0;
        if(m == 1) return section.length;
        for(int i=1;i<section.length;i++) {
            count = section[i]-section[i-1]+1;
            if(count >= m) {
                result++;
                count=0;   
            }
        }
            
        return result;
    }
}