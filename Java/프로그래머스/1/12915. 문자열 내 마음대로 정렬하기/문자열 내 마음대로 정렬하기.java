import java.util.Arrays;
class Solution {
    public String[] solution(String[] strings, int n) {
        return func(strings,n);
    }
    
    private static String[] func(String[] strings, int n) {
        String[] result = strings.clone();
        for(int i=0;i<result.length;i++) {
            result[i] = result[i].charAt(n)+result[i];
        }
        Arrays.sort(result);
        for(int i=0;i<result.length;i++) {
            result[i] = result[i].substring(1);
        }
        
        return result;
    }
}   