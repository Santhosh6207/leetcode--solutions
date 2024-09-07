class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int dp[]=new int[n+1];
        dp[0]=cost[0];
        dp[1]=cost[1];
        for(int i=2;i<n;i++)
        {
            dp[i]=cost[i]+Math.min(dp[i-1],dp[i-2]);
        }
        return Math.min(dp[n-1],dp[n-2]);
        
    }
   /* public int find(int c[],int i,int dp[])
    {
         if(i<0)
          return 0;
          if(i==0||i==1)
            return c[i];
            if(dp[i]!=-1)
             return dp[i];
            dp[i]= c[i]+Math.min(find(c,i-1,dp),find(c,i-2,dp));
            return dp[i];
    }*/
}