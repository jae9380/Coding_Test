import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int answer = func(numbers);

        return answer;
    }
    private static int func(int[] numbers) {
        int answer=0;
        int[] oneToNine = {0,1,2,3,4,5,6,7,8,9};
        Arrays.sort(numbers);
        boolean find = false;
        for (int i : oneToNine) {
            find =false;
            for (int j : numbers) {
                find = i==j ? true : false;
                if (find){
                    break;
                }
            }
            if (!find) {
                answer +=i;
            }
        }
        return answer;
    }
}