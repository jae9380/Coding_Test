class Solution {
    public String[] solution(String[] names) {
        int count = 0;
        int size = names.length%5 == 0 ? names.length/5 : names.length/5+1;
        String[] answer = new String [size];
        for(int i=0; i<names.length; i+=5) {
            answer[count] = names[i];
            count++;
        }
        return answer;
    }
}