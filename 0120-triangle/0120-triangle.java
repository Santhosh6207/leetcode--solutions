class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
       int n=triangle.size();
       int[][] dp=new int[n][n];
       for(int i=0;i<n;i++)
       {
        Arrays.fill(dp[i],-1);
       }
       return solve(0,0,triangle,dp);  
    }
    public int solve(int i,int j,List<List<Integer>>t,int dp[][])
    {
        if(i==t.size()-1)
          return t.get(i).get(j);
          if(dp[i][j]!=-1)
            return dp[i][j];
          int down=t.get(i).get(j)+solve(i+1,j,t,dp);
          int downr=t.get(i).get(j)+solve(i+1,j+1,t,dp);
          return dp[i][j]=Math.min(down,downr);
    }
}