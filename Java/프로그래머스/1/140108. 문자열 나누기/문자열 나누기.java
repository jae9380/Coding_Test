class Solution {
    public int solution(String s) {
        return func(s);
    }
    private static int func(String s) {
        int result = 0, count_x=0, count_non_x=0;
        char x=' ';
        for(int i=0; i<s.length(); i++) {
            if(count_x==0){
                x=s.charAt(i);
                count_x++;
            }else {
                if(s.charAt(i)==x) {
                    count_x++;
                }else{
                    count_non_x++;
                }
                if(count_x==count_non_x) {
                    result ++;
                    x=' ';
                    count_x=0;
                    count_non_x=0;
                }
            }
             if (i==s.length()-1 && count_x!=count_non_x){
                    result++;
                }
        }
        return result;
    }
}