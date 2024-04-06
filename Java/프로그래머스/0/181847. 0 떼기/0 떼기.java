class Solution {
    public String solution(String n_str) {
        String answer = "";
        boolean first = false;
        int index = 0;
        while(!first) {
            first = n_str.charAt(index) != '0' ? true : false;
            index = first ? index : index+1;
        }
        answer = n_str.substring(index);
        return answer;
    }
}