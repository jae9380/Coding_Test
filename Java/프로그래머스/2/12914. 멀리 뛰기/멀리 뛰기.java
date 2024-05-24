class Solution {
    public long solution(int n) {
//        int half_n = n/2;
//        long answer = 0;
//        for(int i=half_n; i>=0 ;i--) {
//            answer += combination(n-i,i);
//        }
//        return answer;
//    }
//    private static long combination(int n, int k) {
//        long numerator = factorial(n);
//        long denominator = factorial(k)* factorial(n-k);
//        return numerator/denominator;
//    }
//    private static long factorial(int n) {
//        if (n==0) return 1;
//        long result = 1;
//        for (int i=1; i<=n; i++){
//            result*=i;
//        }
//        return result;
//    }
        if(n==1){
            return 1;
        }else if(n==2) return 2;
        final int MOD = 1234567;
        long[] dp = new long[n];
        dp[0]=1;
        dp[1]=2;
        
        for(int i=2; i<n; i++) {
            dp[i] = (dp[i-1] + dp[i-2])%MOD;
        }
        
        long answer= dp[n-1];
        return answer;
    }
}
    