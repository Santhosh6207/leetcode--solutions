class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int ar[][]=new int[m][n];
        int k=0;
        if(m*n==original.length)
        {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {  
                if(k<=m*n)
                ar[i][j]=original[k++];
            }
        }
        }
        else
        return new int[0][0];
        return ar;
    }
}