class Solution {
    public int[] solution(long n) {
        String[] numArr = String.valueOf(n).split("");
        int[] answer = new int[numArr.length];
        for (int i=0; i<numArr.length; i++) {
            answer[i] = Integer.parseInt(numArr[numArr.length-1-i]);
        }
        return answer;
    }
}