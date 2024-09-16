import java.util.*;
class Solution {
    static int count = 1;
    static int[] map;
    static class Node {
        int x, y, v;
        Node(int x, int y, int v) {
            this.x = x;
            this.y = y;
            this.v = v;
        }
    }
    public int solution(int N, int[][] road, int K) {
        ArrayList<ArrayList<Node>> list = new ArrayList<>();
        for (int i=0; i<=N; i++) {
            list.add(new ArrayList<>());
        }
        for (int[] r : road) {
            list.get(r[0]).add(new Node(r[0], r[1], r[2]));
            list.get(r[1]).add(new Node(r[1], r[0], r[2]));
        }
        map = new int[N+1];
        for (int i = 2; i< map.length; i++) {
            map[i] = Integer.MAX_VALUE;
        }
        bfs(list.get(1), list, K);
        return count;
    }
    public void bfs(ArrayList<Node> node, ArrayList<ArrayList<Node>> lst, int K) {
        Queue<Node> q = new LinkedList<>();
        q.addAll(node);
        while (!q.isEmpty()) {
            Node n = q.poll();
            if(map[n.y] >= map[n.x] + n.v) {
                map[n.y] = map[n.x] + n.v;
                q.addAll(lst.get(n.y));
            }
        }
        for (int i = 2; i< map.length; i++) {
            if (map[i] <= K) count++;
        }
    }
}