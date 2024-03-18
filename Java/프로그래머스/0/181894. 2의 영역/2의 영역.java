class Solution {
    public int[] solution(int[] arr) {
        int start = 0, end = 0;
        boolean hasFirst = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] ==2) {
                if (start == 0 && !hasFirst){
                    start = i;
                    hasFirst = true;
                }else {
                    end = i;
                }
            }
        }
        if (end !=0) {
            int[] answer = new int[end - start +1];
            int count = 0;
            for (int i = start; i <= end; i++) {
                answer[count] = arr[i];
                count++;
            }
            return answer;
        } else if (start != 0 && end ==0) {
            int[] answer = {2};
            return answer;
        }else {
            int[] answer = {-1};
            return answer;
        }
        
    }
}