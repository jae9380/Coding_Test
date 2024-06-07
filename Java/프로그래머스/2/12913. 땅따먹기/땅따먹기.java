class Solution {
    int solution(int[][] land) {
        int row = land.length;
        for(int i = 0; i < row-1; i ++) {
            land[i + 1][0] += Math.max(land[i][1], Math.max(land[i][2],land[i][3]));
            land[i + 1][1] += Math.max(land[i][0], Math.max(land[i][2],land[i][3]));
            land[i + 1][2] += Math.max(land[i][0], Math.max(land[i][1],land[i][3]));
            land[i + 1][3] += Math.max(land[i][0], Math.max(land[i][1],land[i][2]));
        }          
        int answer = Math.max(Math.max(land[row-1][0],land[row-1][1]), Math.max(land[row-1][2],land[row-1][3]));
        return answer;
    }
}