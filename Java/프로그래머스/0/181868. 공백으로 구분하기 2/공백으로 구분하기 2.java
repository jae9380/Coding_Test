import java.util.ArrayList;
class Solution {
    public String[] solution(String my_string) {
        my_string = my_string.trim();
        String[] strArr = my_string.split(" ");
        ArrayList<String> wordList = new ArrayList<>();
        for (String s : strArr) {
            if (!s.equals("")) wordList.add(s);
        }
        String[] answer = wordList.toArray(new String[0]);
        return answer;
    }
}