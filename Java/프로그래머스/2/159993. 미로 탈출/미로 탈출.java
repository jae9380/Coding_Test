import java.util.*;

class Solution {
    static class Pointer {
        int x, y, count;
        boolean opLever;
        Pointer(int x, int y, int count, boolean opLever) {
            this.x = x;
            this.y = y;
            this.count = count;
            this.opLever = opLever;
        }
    }

    public static int[][] directions = {{1, 0}, {-1, 0}, {0, -1}, {0, 1}};
    public static boolean[][] visited;
    public static char[][] map;

    public int solution(String[] maps) {
        int n = maps.length;
        int m = maps[0].length();
        map = new char[n][m];

        int sx = -1, sy = -1, lx = -1, ly = -1, ex = -1, ey = -1;
        for (int i = 0; i < n; i++) {
            map[i] = maps[i].toCharArray();
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 'S') {
                    sx = i;
                    sy = j;
                } else if (map[i][j] == 'L') {
                    lx = i;
                    ly = j;
                } else if (map[i][j] == 'E') {
                    ex = i;
                    ey = j;
                }
            }
        }

        int toLever = bfs(sx, sy, lx, ly);
        if (toLever == -1) return -1;

        int toExit = bfs(lx, ly, ex, ey);
        if (toExit == -1) return -1;

        return toLever + toExit;
    }

    private int bfs(int startX, int startY, int targetX, int targetY) {
        int n = map.length;
        int m = map[0].length;
        visited = new boolean[n][m];
        Queue<Pointer> q = new LinkedList<>();
        q.add(new Pointer(startX, startY, 0, false));
        visited[startX][startY] = true;

        while (!q.isEmpty()) {
            Pointer currentPoint = q.poll();

            if (currentPoint.x == targetX && currentPoint.y == targetY) {
                return currentPoint.count;
            }

            for (int[] direction : directions) {
                int nx = currentPoint.x + direction[0];
                int ny = currentPoint.y + direction[1];

                if (nx < 0 || ny < 0 || nx >= n || ny >= m || map[nx][ny] == 'X' || visited[nx][ny]) {
                    continue;
                }

                q.add(new Pointer(nx, ny, currentPoint.count + 1, currentPoint.opLever));
                visited[nx][ny] = true;
            }
        }
        return -1;
    }
}
