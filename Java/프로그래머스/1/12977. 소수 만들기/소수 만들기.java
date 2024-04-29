import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        boolean[] board = new boolean[2997];
        for (int i = 2; i <= 2996; i++) {
			board[i] = true;
		}
        // 에라토스테네스의 체 
		for (int i = 2; i * i <= 2996; i++) {
			if (board[i] == true) {
				for (int j = 2 * i; j <= 2996; j += i) {
					board[j] = false;
				}
			}
		}
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(board[nums[i]+nums[j]+nums[k]]) {
                        answer++;
                        
                    }
                }
            }
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}