class Solution {
    public int solution(String t, String p) {
        return func(t,p);
    }
    private static int func(String t, String p) {
        int result = 0;
        long num = Long.parseLong(p);
        for (int i=0; i<t.length()-(p.length()-1); i++) {
            result = num < Long.parseLong(t.substring(i, i + p.length())) ? result : result + 1 ;
        }
        return result;
    }
}
