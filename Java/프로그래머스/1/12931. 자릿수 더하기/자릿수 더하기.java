import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String[] numArr = String.valueOf(n).split("");
        for(String s : numArr) {
            answer += Integer.parseInt(s);
        }
        return answer;
    }
}