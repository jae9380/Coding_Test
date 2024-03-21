class Solution {
    public String solution(String my_string, String alp) {
        char a = alp.charAt(0);
        String answer = my_string.replace(a, (char) ((char) a-32));
        return answer;
    }
}