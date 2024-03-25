import java.util.Arrays;
import java.util.ArrayList;
class Solution {
    public String[] solution(String myString) {
        String[] myStrArr = myString.split("x");

        ArrayList<String> mystrList = new ArrayList<>();

        for (String s : myStrArr) {
            if (!s.isEmpty()) mystrList.add(s);
        }

        String[] answer = mystrList.toArray(new String[0]);
        
        Arrays.sort(answer);
        
        return answer;
    }
}