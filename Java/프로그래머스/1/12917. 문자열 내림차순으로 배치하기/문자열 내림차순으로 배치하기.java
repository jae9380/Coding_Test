import java.util.*;
class Solution {
    public String solution(String s) {
        String[] arr= s.split("");

        Arrays.sort(arr,Comparator.reverseOrder());

        String answer = String.join("",arr);
        return answer;
    }
}