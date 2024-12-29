class Solution {
    Integer dp[];
    public int numSquares(int n) {
        if(find(n))
          return 1;
          dp=new Integer[n+1];
       int res=solve(n);
       return res; 
    }
    public int solve(int n)
    {
        if(n==0)
        {
              return 0;
        }
        if(dp[n]!=null)
          return dp[n];
        int min=Integer.MAX_VALUE;
        for(int i=1;i*i<=n;i++)
        {
             int steps=1+solve(n-i*i);
             dp[n]=min=Math.min(min,steps);
        }
        return dp[n];
    }
    public boolean find(int n)
    {
        int num=(int)Math.sqrt(n);
        if(num*num==n)
          return true;
        else
           return false;
    }
}