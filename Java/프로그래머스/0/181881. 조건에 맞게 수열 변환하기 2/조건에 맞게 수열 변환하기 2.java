class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int count = arr.length;

        while (true) {
            answer++;

            for (int i = 0; i < arr.length ; i++) {
                if (arr[i] >= 50 && arr[i] % 2 ==0) {
                    arr[i] = arr[i]/2;
                    count--;
                } else if (arr[i] < 50 && arr[i] % 2 !=0) {
                    arr[i] = (arr[i]*2)+1;
                    count--;
                }
            }
            if (count == arr.length) {
                return answer - 1;
            }
            count = arr.length;
        }
    }
}