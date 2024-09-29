class Solution {
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<n;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return solve(grid, n - 1, m - 1,dp); 
    }

    public int solve(int[][] grid, int i, int j,int[][] dp) {
        if (i == 0 && j == 0) 
            return grid[0][0];
        if (i < 0 || j < 0)  
            return Integer.MAX_VALUE;
            if(dp[i][j]!=-1)
              return dp[i][j];
        int up =  solve(grid, i - 1, j,dp);  
        int left =  solve(grid, i, j - 1,dp); 

        return dp[i][j]=grid[i][j]+Math.min(up, left); 
    }
}
