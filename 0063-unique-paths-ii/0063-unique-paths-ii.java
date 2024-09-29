class Solution {
    public int uniquePathsWithObstacles(int[][] obj) {
        
        int n=obj.length;
        int m=obj[0].length;
        if(n==0&&m==0)
          return 0;
           if (obj[0][0] == 1 || obj[n - 1][m - 1] == 1) {
            return 0;
        }
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<n;i++)
        Arrays.fill(dp[i],-1);
        return solve(obj,n-1,m-1,dp);
    }
    public int solve(int[][] obj,int i,int j,int[][] dp)
    {
        if(i==0&&j==0)
          return 1;
          if(i<0||j<0)
            return 0;
     if(obj[i][j]==1)
       return 0;
       if(dp[i][j]!=-1)
         return dp[i][j];
       int up=solve(obj,i-1,j,dp);
     //if(obj[i][j]!=1)
      int left=solve(obj,i,j-1,dp);
      return dp[i][j]=up+left;
    }
}