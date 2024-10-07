class Solution {
    int answer = 0;
    boolean[] visited;
    public int solution(int n, int[][] computers) {
        visited = new boolean[computers.length];
        for (int i = 0; i < computers.length; i++){
            if (!visited[i]){
                answer++;   
                dfs(i, computers);    
            }   
        }
        return answer;
    }
    private void dfs(int num, int[][] computers) {
        visited[num] = true;
        for (int i = 0; i < computers.length; i++){
            if (!visited[i] && computers[num][i] == 1) dfs(i, computers);
        }
    }
}