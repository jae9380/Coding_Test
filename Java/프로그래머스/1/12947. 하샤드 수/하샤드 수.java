class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String[] num = String.valueOf(x).split("");
        int sum=0;
        for(int i=0; i<num.length; i++) {
            sum += Integer.parseInt(num[i]);
        }
        answer = x%sum==0 ? true : false; 
        return answer;
    }
}