import java.util.ArrayList;
class Solution {
    public int[] solution(String myString) {
        String[] a = myString.split("x");
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (String s : a) {
            arrayList.add(s.length());
        }
        
        if (myString.charAt(myString.length()-1)=='x') arrayList.add(0);

        int[] answer = arrayList.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        return answer;
    }
}