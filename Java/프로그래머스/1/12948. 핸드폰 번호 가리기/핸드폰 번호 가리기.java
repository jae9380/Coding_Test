class Solution {
    public String solution(String phone_number) {
        String target = phone_number.substring(0,phone_number.length()-4);
        String changNum = "";
        for (int i = 0; i <target.length() ; i++) {
            changNum+="*";
        }
        String answer = phone_number.replace(target,changNum);
        return answer;
    }
}