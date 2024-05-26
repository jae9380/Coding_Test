class Solution {
    public int[][] solution(int n) {
        int[][] matrix = new int[n][n];
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int currentDirection = 0;
        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        int row = 0, col = 0;
        for (int value = 1; value <= n * n; value++) {
            matrix[row][col] = value;
            int nextRow = row + directions[currentDirection][0];
            int nextCol = col + directions[currentDirection][1];
            if (nextRow < top || nextRow > bottom || nextCol < left || nextCol > right || matrix[nextRow][nextCol] != 0) {
                if (currentDirection == 0) {
                    top++;
                } else if (currentDirection == 1) {
                    right--;
                } else if (currentDirection == 2) {
                    bottom--;
                } else if (currentDirection == 3) {
                    left++;
                }
                currentDirection = (currentDirection + 1) % 4;
                nextRow = row + directions[currentDirection][0];
                nextCol = col + directions[currentDirection][1];
            }
            row = nextRow;
            col = nextCol;
        }
        return matrix;
    }
}