class Solution {
    public int[] solution(int n, int m) {
        return func(n,m);
    }
        private static int[] func(int a, int b) {
        int GCD =getGCD(a,b);
        int LCM = a*b/GCD;
        int[] result = {GCD,LCM};
        return result;
    }

    private static int getGCD(int a, int b) {
        while (a >= 1 && b >= 1) {
            if (a < b) {
                b %= a;
            } else {
                a %= b;
            }
        }
        if (a >= 1) return a;
        return b;
    }
}