class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        String[] stringArray = my_string.split("");
        for(int index : indices) {
            stringArray[index] = "";
        }
        answer = String.join("",stringArray);
        return answer;
    }
}