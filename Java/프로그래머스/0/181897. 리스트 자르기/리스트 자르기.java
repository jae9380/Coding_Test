import java.util.ArrayList;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        ArrayList<Integer> list = new ArrayList<>();

        int start = 0, end = 0, inc = 1;

        switch (n) {
            case 1:
                start = 0;
                end = slicer[1];
                break;
            case 2:
                start = slicer[0];
                end = num_list.length-1;
                break;
            case 3:
                start = slicer[0];
                end = slicer[1];
                break;
            case 4:
                start = slicer[0];
                end = slicer[1];
                inc = slicer[2];
                break;
        }

        for (int i = start; i <= end ; i+=inc) {
            list.add(num_list[i]);
        }
        
        int[] answer = list.stream()
            .mapToInt(i->i)
            .toArray();
        
        return answer;
    }
}