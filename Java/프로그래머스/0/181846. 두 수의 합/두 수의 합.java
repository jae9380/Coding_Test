import java.math.BigInteger;
class Solution {
    public String solution(String a, String b) {
        BigInteger num_a = new BigInteger(a);
        BigInteger num_b = new BigInteger(b);
        String answer = String.valueOf(num_a.add(num_b));
        return answer;
    }
}