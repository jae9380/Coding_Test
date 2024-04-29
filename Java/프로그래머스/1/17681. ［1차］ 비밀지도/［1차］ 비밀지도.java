class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String result = "";
        for(int i=0; i<n; i++) {
            int line = arr1[i]|arr2[i];
            for(int j=line; j>0; j/=2) {
                result = String.valueOf(j%2)+result;
            }
            if(result.length() < n) {
                while(result.length()<n) {
                    result = 0+result;
                }
            }
            answer[i] = result.replaceAll("1","#").replaceAll("0"," ");
            result = "";
        }
        
        return answer;
    }
}