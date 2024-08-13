import java.util.*;
class Solution {
    public static int[][] directions = {{1, 0}, {-1, 0}, {0, -1}, {0, 1}};
    public static boolean[][] visited;
    public static char[][] map;

    static class Pointer {
        int x, y, count;

        public Pointer(int x, int y, int count) {
            this.x = x;
            this.y = y;
            this.count = count;
        }
    }
    public int solution(String[] board) {
        map = new char[board.length][board[0].length()];
        visited = new boolean[board.length][board[0].length()];
        Queue<Pointer> queue = new LinkedList<>();
        int startX = -1, startY = -1;
        for (int i = 0; i < board.length; i++) {
            map[i] = board[i].toCharArray();
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] == 'R') {
                    startX = i;
                    startY = j;
                    break;
                }
            }
        }
        queue.add(new Pointer(startX, startY, 0));
        visited[startX][startY] = true;
        while (!queue.isEmpty()) {
            Pointer currentPoint = queue.poll();
            if (map[currentPoint.x][currentPoint.y] == 'G') {
                return currentPoint.count;
            }
            for (int[] direction : directions) {
                int nx = currentPoint.x;
                int ny = currentPoint.y;
                while (true) {
                    int nextX = nx + direction[0];
                    int nextY = ny + direction[1];

                    if (nextX < 0 || nextY < 0 || nextX >= board.length || nextY >= board[0].length() || map[nextX][nextY] == 'D') break;
                    nx = nextX;
                    ny = nextY;
                }
                if (!visited[nx][ny]) {
                    visited[nx][ny] = true;
                    queue.add(new Pointer(nx, ny, currentPoint.count + 1));
                }
            }
        }
        return -1;
    }
}