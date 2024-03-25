import java.util.ArrayList;
import java.util.List;
class Solution {
    public String[] solution(String myStr) {

        myStr = myStr.replaceAll("a"," ").replaceAll("b"," ").replaceAll("c"," ").trim();

        String[] strArr = myStr.split(" ");
        List<String> strList = new ArrayList<>();

        for (String s : strArr) {
            if (!s.isEmpty() && s != " ") strList.add(s);
        }
        
        if (strList.isEmpty()) {
            String[] answer = {"EMPTY"};
            return answer;
        }
        
        String[] answer =  strList.toArray(new String[strList.size()]);
        
        return answer;
    }
}