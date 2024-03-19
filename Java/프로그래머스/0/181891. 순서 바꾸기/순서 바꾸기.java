import java.util.Arrays;
class Solution {
    public int[] solution(int[] num_list, int n) {
        String num_String = Arrays.toString(num_list)
                .replace(",","")
                .replace(" ","")
                .replace("[","")
                .replace("]","");
        num_String = num_String.substring(n) + num_String.substring(0,n);

        String[] arr = num_String.split("");
        int[] answer = new int[arr.length];

        for (int i = 0; i < arr.length ; i++) {
            answer[i] = Integer.parseInt(arr[i]);
        }
        return answer;
    }
}