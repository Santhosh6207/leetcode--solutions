class Solution {
    public int lengthOfLIS(int[] nums) {
        Integer dp[][]=new Integer[nums.length+1][nums.length+1];
        int res=solve(0,-1,nums,dp);
        return res;
    }
    public int solve(int i,int prev_index,int ar[],Integer dp[][])
    {
        if(i==ar.length)
           return 0;
           if(dp[i][prev_index+1]!=null)
              return dp[i][prev_index+1];
      int not=solve(i+1,prev_index,ar,dp);
      int take=0;
      if(prev_index==-1||ar[i]>ar[prev_index])
      {
        take=1+solve(i+1,i,ar,dp);
      }
     return dp[i][prev_index+1]= Math.max(take,not);
    }
}