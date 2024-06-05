class Solution {
    static int answer = 0;
    static boolean[] visit;
    
    public int solution(int k, int[][] dungeons) {
        visit = new boolean[dungeons.length];
        func(0, dungeons, k);
        return answer;
    }
    
    private static void func(int count, int[][] dungeons, int fatigue) {
        for(int i=0; i<dungeons.length;i++) {
            if(visit[i]||dungeons[i][0]>fatigue) continue;
            visit[i] = true;
            func(count+1, dungeons, fatigue-dungeons[i][1]);
            visit[i] = false;
        }
        answer = Math.max(count, answer);
    }
}