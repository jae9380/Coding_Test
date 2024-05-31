import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        for(String[] arr : clothes) {
            if(!map.containsKey(arr[1])) {
                map.put(arr[1],1);
            }else{
                map.put(arr[1], map.getOrDefault(arr[1], 1) + 1);
            }
        }
        
        for(Integer val : map.values()){
            answer*=val+1;
        }
        return answer-1;
    }
}