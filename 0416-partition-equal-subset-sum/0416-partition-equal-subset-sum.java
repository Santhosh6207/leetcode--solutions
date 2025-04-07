class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int num:nums)
        {
            sum+=num;
        }
        if(sum%2!=0)
          return false;
        int target_sum=sum/2;
        boolean dp[]=new boolean[target_sum+1];
        dp[0]=true;
        for(int num:nums)
        {
            for(int csum=target_sum;csum>=num;csum--)
            {
                dp[csum]=dp[csum]||dp[csum-num];
                if(dp[target_sum])
                  return true;
            }
        }
        return dp[target_sum];
    }
}