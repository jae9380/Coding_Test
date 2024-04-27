class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        int[] count_x = {0,0,0,0,0,0,0,0,0,0};
        int[] count_y = {0,0,0,0,0,0,0,0,0,0};
        for(int i=0; i<X.length();i++){
           count_x[X.charAt(i)-48] += 1;
        }
        for(int i=0; i<Y.length();i++){
           count_y[Y.charAt(i)-48] += 1;
        }

        for(int i=9; i >= 0; i--){
            for(int j=0; j<Math.min(count_x[i],count_y[i]); j++){
                answer.append(i);
            }
        }
        if("".equals(answer.toString())){
           return "-1";
        }else if(answer.toString().charAt(0)==48){
           return "0";
        }else {
            return answer.toString();
        }
    }
}