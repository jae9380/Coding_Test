import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        
        for(int i=0;i<speeds.length;i++) {
            q.add((100-progresses[i])%speeds[i]!=0?
                 (100-progresses[i])/speeds[i]+1 : (100-progresses[i])/speeds[i]);
        }
        int x=q.poll(), c=1;
        while(!q.isEmpty()) {
            if(x>= q.peek()) {
                c++;
                q.poll();
            }else {
                list.add(c);
                c=1;
                x=q.poll();
            }
        }
        list.add(c);
        
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}