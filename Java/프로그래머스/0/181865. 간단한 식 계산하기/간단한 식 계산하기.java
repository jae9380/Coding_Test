class Solution {
    public int solution(String binomial) {
        
        String[] s = binomial.split(" ");
        
        String operation = s[1];
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[2]);

        int answer = 
            operation.equals("+") ? a+b :
            operation.equals("-") ? a-b :
            operation.equals("*") ? a*b : a/b;
        
        return answer;
    }
}