class Solution {
   /* public int crob(int idx,int nums[],int dp[])
    {
        if(idx==0)
         return nums[idx];
         if(idx<0)
          return 0;
          if(dp[idx]!=-1)
            return dp[idx];
          int pick=nums[idx]+crob(idx-2,nums,dp);
          int notpick=0+crob(idx-1,nums,dp);
          return dp[idx]= Math.max(pick,notpick);
    }*/
    public int rob(int[] nums) {
        
      int n=nums.length;
     
       if(n==1)
       return (nums[0]);
      int dp[]=new int[n+1];
      Arrays.fill(dp,-1);
      dp[0]=nums[0];
      dp[1]=Math.max(nums[0],nums[1]);
      for(int i=2;i<n;i++)
      {  
        dp[i]=Math.max(dp[i-1],nums[i]+dp[i-2]);
      }
      return dp[n-1];
    }
}