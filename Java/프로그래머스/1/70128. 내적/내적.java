class Solution {
    public int solution(int[] a, int[] b) {
        return func(a,b);
    }
    
    private static int func(int[] a, int[]b) {
        int result = 0;
        for(int i=0; i<a.length; i++){
            result += a[i]*b[i];
        }
        return result;
    }
}