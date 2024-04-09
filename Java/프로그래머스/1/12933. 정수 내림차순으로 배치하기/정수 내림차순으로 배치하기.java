import java.util.*;
class Solution {
    public long solution(long n) {
        String answer = "";
        String[] nArr = String.valueOf(n).split("");
        Arrays.sort(nArr, Comparator.reverseOrder());

        for (String s : nArr) {
            answer+=s;
        }
        return Long.parseLong(answer);
    }
}