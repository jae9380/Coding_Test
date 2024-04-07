import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
class Solution {
    public int[][] solution(int[][] arr) {
        if (arr.length == arr[0].length){
            return arr;
        }
        List<List<Integer>> list = Arrays.stream(arr)
                .map(row -> Arrays.stream(row)
                        .boxed()
                        .collect(Collectors.toList()))
                .collect(Collectors.toList());

        if (list.size()>list.get(0).size()){
            int a = list.size() - list.get(0).size();
            for (List<Integer> integersList : list) {
                for (int i = 0; i <a ; i++) {
                    integersList.add(0);
                }
            }
        }else {
            int colIndex = list.size(), rowIndex = list.get(0).size(), addArrSize = rowIndex-colIndex;
            List<Integer> zeroRow = new ArrayList<>(Collections.nCopies(rowIndex, 0));
            for (int i = 0; i < addArrSize; i++) {
                list.add(new ArrayList<>(zeroRow));
            }
        }

        int[][] answer = list.stream()
                .map(innerList -> innerList.stream().mapToInt(Integer::intValue).toArray())
                .toArray(int[][]::new);
        
        return answer;
    }
}