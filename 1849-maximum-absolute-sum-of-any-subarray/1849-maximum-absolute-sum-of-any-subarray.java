class Solution {
    public int maxAbsoluteSum(int[] nums) {
        
        int sum=0;
        int maxsum=0;
        int abssum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            if(sum<0)
            {
               sum=0;
            }
            else
            maxsum=Math.max(maxsum,sum);
        }
        sum=0;
        for(int num:nums)
        {
            num=num*-1;
            sum+=num;
            if(sum<0)
             sum=0;
             else
             maxsum=Math.max(maxsum,sum);
        }
        return maxsum;
    }
}