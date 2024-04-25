import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        return func(arr);
    }
    private static int[] func(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int num : arr) {
            if (stack.isEmpty() || num != stack.peek()) {
                stack.push(num);
            }
        }

        int[] result = new int[stack.size()];
        int index = stack.size() - 1;
        while (!stack.isEmpty()) {
            result[index--] = stack.pop();
        }

        return result;
    }
}