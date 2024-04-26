class Solution {
    public int solution(int[][] sizes) {
        int answer = 0, x=0, y=0;
        for(int i=0; i<sizes.length;i++){
            if(sizes[i][0]>sizes[i][1]) {
                x = sizes[i][0] > x ? sizes[i][0] : x;
                y = sizes[i][1] > y ? sizes[i][1] : y;
            }else{
                x = sizes[i][1] > x ? sizes[i][1] : x;
                y = sizes[i][0] > y ? sizes[i][0] : y;
            }
        }
        answer = x*y;
        return answer;
    }
}