class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        long sum = 0;
        long sumSquare = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum += grid[i][j];
                sumSquare += (long)grid[i][j] * grid[i][j];
            }
        }

        long nSquare = (long)n * n;
        long sum1 = nSquare * (nSquare + 1) / 2;
        long sumSquare1 = nSquare * (nSquare + 1) * (2 * nSquare + 1) / 6;

        long temp1 = sum1 - sum;
        long temp2 = sumSquare1 - sumSquare;
        temp2 = temp2 / temp1;

        int[] result = new int[2];
        result[1] = (int)((temp1 + temp2) / 2);
        result[0] = (int)(result[1] - temp1);
  
        return result;

        
    }
}