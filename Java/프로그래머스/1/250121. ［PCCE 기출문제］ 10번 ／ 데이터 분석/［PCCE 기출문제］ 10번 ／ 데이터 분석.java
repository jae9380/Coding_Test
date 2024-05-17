import java.util.*;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        Map<String,Integer>map = new HashMap<>();
        map.put("code",0);
        map.put("date",1);
        map.put("maximum",2);
        map.put("remain",3);
        int i = map.get(ext), j = map.get(sort_by);
        return Arrays.stream(data)
                .filter(row -> row[i] <= val_ext)
                .sorted(Comparator.comparingInt(row->row[j]))
                .toArray(int[][]::new);
    }
}