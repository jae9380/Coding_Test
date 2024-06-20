import java.util.*;
class Solution {
    public int solution(int[][] maps) {
        return func(maps);
    }
    private static int func(int[][] arr) {
        int n=arr.length, m=arr[0].length;
        int[] dx={0,0,1,-1}, dy={1,-1,0,0};
        
        Queue<int[]> queue=new LinkedList<>();
        boolean[][] visitedEl = new boolean[n][m];
        
        queue.offer(new int[]{0,0,1});
        visitedEl[0][0]=true;
        
        while(!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0], y = cur[1], distance = cur[2];
            
            if(x==n-1 && y==m-1) return distance;
            
            for(int i=0; i<4;i++) {
                int nx=x+dx[i], ny=y+dy[i];
                if(nx>=0 && ny>=0 && nx<n && ny<m && arr[nx][ny]==1 && !visitedEl[nx][ny]) {
                    visitedEl[nx][ny]=true;
                    queue.offer(new int[] {nx,ny,distance+1});
                }   
            }
        }
        return -1;
    }
}