class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return Math.min(find(cost,n-1,dp),find(cost,n-2,dp));
        
    }
    public int find(int c[],int i,int dp[])
    {
         if(i<0)
          return 0;
          if(i==0||i==1)
            return c[i];
            if(dp[i]!=-1)
             return dp[i];
            dp[i]= c[i]+Math.min(find(c,i-1,dp),find(c,i-2,dp));
            return dp[i];
    }
}