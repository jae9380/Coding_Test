class Solution {
    public long solution(long n) {
        boolean ess = Math.sqrt(n)%1 == 0 ? true : false;
        return ess ? (long) Math.pow(Math.sqrt(n) + 1, 2) : -1;
    }
}