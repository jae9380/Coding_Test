import java.util.*;
class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = arr1.length != arr2.length ? arr1.length > arr2.length ? 1 : -1 : 0;
        if (answer == 0 ) {
            int arr1sum = Arrays.stream(arr1).sum();
            int arr2sum = Arrays.stream(arr2).sum();
            answer = arr1sum != arr2sum ? arr1sum > arr2sum ? 1 : -1 : 0;
        }
        return answer;
    }
}