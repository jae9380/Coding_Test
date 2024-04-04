import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        Arrays.sort(strArr, Comparator.comparing(String::length));

        int answer = 0;
        int count = 0;
        int len = 0;

        for (String s : strArr) {
            if (s.length() != len) {
                len = s.length();
                count = 1;
            }else {
                count++;
            }
            if (answer < count) answer = count;
        }
        return answer;
    }
}