import java.util.List;
class Solution {
    public int solution(String myString, String pat) {
        List<String> patList = List.of(pat.split(""));
        pat = "";

        for (String s : patList) {
            s = s.equals("A") ? "B" : "A";
            pat += s;
        }

        return myString.contains(pat) ? 1 : 0;
    }
}