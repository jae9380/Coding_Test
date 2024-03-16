class Solution {
    public int solution(int[] arr, int idx) {
        int answer = 0;
        for(int i=idx; i<arr.length; i++) {
            if(arr[i] == 1) {
                return i;
            }else{
                if(i==arr.length-1 && arr[i]!=1) return -1;
                continue;
            }
        }
        return answer;
    }
}