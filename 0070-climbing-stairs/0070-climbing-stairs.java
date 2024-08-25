class Solution {
    public int climbStairs(int n) {
        if(n==0)
         return n;
         if(n==1)
          return n;
     int dp[]=new int[n+1];
     Arrays.fill(dp,-1);
     //dp[0]=0;
     //dp[1]=1;
     int res=cb(n,dp);
      return res;  
    }
    public int cb(int n,int dp[])
    {
        if(n<=1)   
          return 1;
          if(dp[n]!=-1)
           return dp[n];
           return dp[n]=cb(n-1,dp)+cb(n-2,dp);
    }
}