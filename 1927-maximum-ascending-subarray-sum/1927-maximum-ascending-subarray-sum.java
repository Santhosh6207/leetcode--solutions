class Solution {
    public int maxAscendingSum(int[] nums) {
        
        int maxsum=0;
        int sum=nums[0];
        maxsum=Math.max(sum,maxsum);
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<=nums[i-1])
            {
                sum=0;
                sum+=nums[i];
                maxsum=Math.max(sum,maxsum);
            }
            else
            {
                sum+=nums[i];
                maxsum=Math.max(maxsum,sum);
            }
        }
        // if(nums[nums.length-1]>nums[nums.length-2])
        // {
        //     sum+=nums[nums.length-1];
        //     maxsum=Math.max(maxsum,sum);
        // }
        return maxsum;
    }
}