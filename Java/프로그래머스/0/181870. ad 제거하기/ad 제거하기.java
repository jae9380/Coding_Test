import java.util.ArrayList;
class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> list = new ArrayList<>();
        
        for (String word : strArr) {
            if (!word.contains("ad")) list.add(word);
        }
        
        String[] answer = list.toArray(new String[0]);
        return answer;
    }
}