import java.util.*;
class Solution {
    public String solution(String[] seoul) {
        ArrayList<String> seoulList = new ArrayList<String>(Arrays.asList(seoul));
        
        return "김서방은 "+seoulList.indexOf("Kim")+"에 있다";
    }
}