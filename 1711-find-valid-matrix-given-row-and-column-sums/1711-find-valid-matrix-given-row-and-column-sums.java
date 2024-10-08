class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
         int n = rowSum.length;
        int m = colSum.length;
        int[][] ar = new int[n][m];

        int i = 0;
        int j = 0;
        while (i < n && j < m) {
            int x = Math.min(rowSum[i], colSum[j]);
            ar[i][j] = x;
            rowSum[i] -= x;
            colSum[j] -= x;
            if (rowSum[i] == 0) 
                i++;
            if(colSum[j]==0)
                j++;
            
        }
        return ar;

    }
}