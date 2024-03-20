class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        if (myString.length()<pat.length()) return answer;

        myString = myString.toUpperCase();

        answer = myString.contains(pat.toUpperCase()) ? 1 :0; 
        return answer;
    }
}