class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int rows_A = arr1.length;
        int cols_A = arr1[0].length;
        int rows_B = arr2.length;
        int cols_B = arr2[0].length;
        int[][] result = new int[rows_A][cols_B];
        for (int i = 0; i < rows_A; i++) {
            for (int k = 0; k < cols_A; k++) {
                for (int j = 0; j < cols_B; j++) {
                    result[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        return result;
    }
}