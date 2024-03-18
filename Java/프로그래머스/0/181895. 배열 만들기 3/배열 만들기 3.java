class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int count = 0;
        int[]answer = new int[intervals[0][1]+intervals[1][1]-intervals[0][0]-intervals[1][0]+2];
        for (int i = 0; i < intervals.length ; i++) {
            for (int j = intervals[i][0]; j <= intervals[i][1] ; j++) {
                answer[count] = arr[j];
                count++;
            }
        }
        return answer;
    }
}