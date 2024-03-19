import java.util.Arrays;
class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        String str = Arrays.toString(str_list)
                .replace(",","")
                .replace(" ","")
                .replace("[","")
                .replace("]","");

        for (int i=0; i< str_list.length; i++) {
            if (str_list[i].equals("l")){
                if(i==0) return answer;
                str = str.substring(0,i);
                return str.split("");
            } else if (str_list[i].equals("r")) {
                if(i==str_list.length-1) return answer;
                str = str.substring(i+1);
                return str.split("");
            }
        }
        return answer;
    }
}